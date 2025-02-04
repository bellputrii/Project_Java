import java.util.ArrayList;

public class Dokter extends orang implements Daftar {
    private String idDokter;
    private String noSTR;
    private String spesialisasi;
    private ArrayList<Antrian> listAntrian;


    public Dokter(String nama, String tanggalLahir, JENIS_KELAMIN gender, String noSTR, String spesialisasi) {
        super(nama, tanggalLahir, gender);
        this.noSTR = noSTR;
        this.spesialisasi = spesialisasi;
        this.listAntrian = new ArrayList<>();
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNoSTR() {
        return noSTR;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public ArrayList<Antrian> getListAntrian() {
        return listAntrian;
    }

    public void tambahAntrian(Antrian antrian) {
        listAntrian.add(antrian);
    }

    public void hapusAntrian(Antrian antrian) {
        listAntrian.remove(antrian);
    }

    @Override
    public void daftar(RumahSakit rumahSakit) {
        rumahSakit.tambahDokter(this);
        this.idDokter = "DR" + rumahSakit.getListDokter().size();
    }
    public void cekAntrian() {
        if (listAntrian.isEmpty()) {
            System.out.println("ANTRIAN KOSONG");
        } else {
            for (Antrian antrian : listAntrian) {
                System.out.println("ID ANTRIAN: " + antrian.getNomorAntrian()
                        + ", Atas nama: " + antrian.getNamaPendaftar());
            }
        }
    }
    @Override
    public String toString(){
        return "DR. " + getNama();
    }
}
