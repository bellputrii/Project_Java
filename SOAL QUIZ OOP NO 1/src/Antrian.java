public class Antrian {
    private String nomorAntrian;
    private String namaPendaftar;
    private String keluhan;
    private Dokter dokterDipilih;
    private tipePasiens tipePasien;

    public enum tipePasiens {
        BPJS,
        MANDIRI
    }
    public Antrian(String nomorAntrian, String namaPendaftar, String keluhan, Dokter dokterDipilih, tipePasiens tipePasien) {
        this.nomorAntrian = nomorAntrian;
        this.namaPendaftar = namaPendaftar;
        this.keluhan = keluhan;
        this.dokterDipilih = dokterDipilih;
        this.tipePasien = tipePasien;
    }

    public String getNomorAntrian() {
        return nomorAntrian;
    }

    public String getNamaPendaftar() {
        return namaPendaftar;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public Dokter getDokterDipilih() {
        return dokterDipilih;
    }

    public tipePasiens getTipePasien() {
        return tipePasien;
    }
}
