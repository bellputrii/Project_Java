public abstract class orang {
    private String nama;
    private String tanggalLahir;
    private JENIS_KELAMIN gender;

    public enum JENIS_KELAMIN {
        LAKI_LAKI,
        PEREMPUAN
    }

    public orang(String nama, String tanggalLahir, JENIS_KELAMIN gender) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public JENIS_KELAMIN getGender() {
        return gender;
    }

    public void setGender(JENIS_KELAMIN gender) {
        this.gender = gender;
    }
}
