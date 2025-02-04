public class Mahasiswa {
    private int id;
    private String nama;
    private String jurusan;
    private int tahunMasuk;

    public Mahasiswa(int id, String nama, String jurusan, int tahunMasuk) {
        this.id = id;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahunMasuk = tahunMasuk;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", jurusan='" + jurusan + '\'' +
                ", tahunMasuk=" + tahunMasuk +
                '}';
    }
}
