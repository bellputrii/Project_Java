import java.util.ArrayList;

public class RumahSakit {
    private String nama;
    private String Alamat;
    private String noHP;
    private ArrayList<Dokter> listDokter;
    private ArrayList<Antrian> listAntrian;

    public RumahSakit(String nama, String Alamat, String noHp) {
        this.nama = nama;
        this.Alamat = Alamat;
        this.noHP = noHp;
        this.listDokter = new ArrayList<>();
        this.listAntrian = new ArrayList<>();
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public ArrayList<Dokter> getListDokter() {
        return listDokter;
    }

    public void setListDokter(ArrayList<Dokter> listDokter) {
        this.listDokter = listDokter;
    }

    public ArrayList<Antrian> getListAntrian() {
        return listAntrian;
    }

    public void setListAntrian(ArrayList<Antrian> listAntrian) {
        this.listAntrian = listAntrian;
    }

    public void tambahDokter(Dokter dokter) {
        for (Dokter d : listDokter) {
            if (d.getNama().equals(dokter.getNama())) {
                System.out.println("DOKTER SUDAH TERDAFTAR.");
                return;
            }
        }
        listDokter.add(dokter);
        dokter.setIdDokter("DR" + listDokter.size());
        System.out.println("SUKSES");
    }

    public void hapusDokter(Dokter dokter) {
        listDokter.remove(dokter);
    }

    public void tambahAntrian(Antrian antrian) {
        listAntrian.add(antrian);
        antrian.getDokterDipilih().tambahAntrian(antrian);
    }

    public void selesaikanAntrian(Antrian antrian) {
        listAntrian.remove(antrian);
        antrian.getDokterDipilih().hapusAntrian(antrian);
    }

    public void cekListDokter() {
        if (listDokter.isEmpty()) {
            System.out.println("BELUM ADA DOKTER YANG TERSEDIA SAAT INI.");
        } else {
            System.out.println("BERIKUT LIST DOKTER YANG TERSEDIA");
            System.out.println("====================================");
            for (Dokter dokter : listDokter) {
                System.out.println("Nama Dokter :  " + dokter.getNama() + ", " +
                        "Dokter spesialis : " + dokter.getSpesialisasi());
        }
            }
    }

    public void cekAntrianPasien() {
        System.out.println("ANTRIAN RUMAH SAKIT SAAT INI");
        for (Dokter dokter : listDokter) {
            System.out.println(dokter);
            dokter.cekAntrian();
            System.out.println("= = = =");
        }
    }

}