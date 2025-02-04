public class Pasien extends orang implements Daftar {
    private String pekerjaan;
    private String domisili;
    private Antrian currentAntrian;

    public Pasien(String nama, String tanggalLahir, JENIS_KELAMIN gender, String pekerjaan, String domisili) {
        super(nama, tanggalLahir, gender);
        this.pekerjaan = pekerjaan;
        this.domisili = domisili;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getDomisili() {
        return domisili;
    }

    @Override
    public void daftar(RumahSakit rumahSakit) {
        System.out.println("Pasien harus memilih dokter dan keluhan untuk daftar.");
    }
    public void daftar(RumahSakit rumahSakit, String keluhan, String namaDokter, Antrian.tipePasiens tipePasien) {
        for (Dokter dokter : rumahSakit.getListDokter()) {
            if (dokter.getNama().equalsIgnoreCase(namaDokter)) {
                for (Antrian antrian : dokter.getListAntrian()) {
                    if (antrian.getNamaPendaftar().equals(this.getNama())) {
                        System.out.println("PASIEN SUDAH TERDAFTAR");
                        return;
                    }
                }
                String nomorAntrian = "D_" + dokter.getSpesialisasi().
                        replace(" ", "_").toUpperCase() + "_" + dokter.getListAntrian().size() + 1;
                Antrian antrian = new Antrian(nomorAntrian, this.getNama(), keluhan, dokter, tipePasien);
                rumahSakit.tambahAntrian(antrian);
                this.currentAntrian = antrian;
                System.out.println("SUKSES");
                return;
            }

        }
        System.out.println("DOKTER TERSEBUT TIDAK DITEMUKAN");
    }

    public void periksa(RumahSakit rumahSakit) {
        if (currentAntrian == null) {
            System.out.println("BELUM TERDAFTAR");
        } else if (currentAntrian.getDokterDipilih() == null) {
            System.out.println("BELUM DIPERIKSA");
        } else {
            rumahSakit.selesaikanAntrian(currentAntrian);
            System.out.println("SUKSES");
            currentAntrian = null;
        }
    }


}
