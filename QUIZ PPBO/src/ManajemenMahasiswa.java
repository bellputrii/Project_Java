import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void hapusMahasiswa(int id) {
        Iterator<Mahasiswa> iterator = daftarMahasiswa.iterator();
        while (iterator.hasNext()) {
            Mahasiswa mahasiswa = iterator.next();
            if (mahasiswa.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public void perbaruiMahasiswa(int id, String nama, String jurusan, int tahunMasuk) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getId() == id) {
                mahasiswa.setNama(nama);
                mahasiswa.setJurusan(jurusan);
                mahasiswa.setTahunMasuk(tahunMasuk);
                break;
            }
        }
    }

    public ArrayList<Mahasiswa> cariMahasiswa(String query) {
        ArrayList<Mahasiswa> hasilPencarian = new ArrayList<>();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (String.valueOf(mahasiswa.getId()).contains(query) ||
                    mahasiswa.getNama().toLowerCase().contains(query.toLowerCase()) ||
                    mahasiswa.getJurusan().toLowerCase().contains(query.toLowerCase())) {
                hasilPencarian.add(mahasiswa);
            }
        }
        return hasilPencarian;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}
