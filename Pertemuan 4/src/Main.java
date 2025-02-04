//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        Buku book = new Buku();
//        book.judul = "Introduction to Software";
//        book.id = 1;
//        book.author = "Dwi";
//        book.jmlHalaman = 10000;
//        book.jmlBab = 200;
//
//        Buku buku2 = new Buku();
//        buku2.judul = "Harry Potter";
//        buku2.id = 3;
//        buku2.author = "JK. Rowling";
//        buku2.jmlHalaman = 2500;
//        buku2.jmlBab = 12;
//
//        Perpustakaan perpusSV = new Perpustakaan();
//        perpusSV.nama = "Perpustakaan Sekolah Vokasi";
//        perpusSV.lokasi = "Sekip xxx";
//
//        perpusSV.listBuku = new ArrayList<Buku>();
//        perpusSV.listBuku.add(book);
//        perpusSV.listBuku.add(buku2);
//
//        Perpustakaan perpusPusat = new Perpustakaan();
//        System.out.println(perpusPusat.lokasi);
//
//        perpusPusat.printSemuaBuku();
//
//        int i = perpusPusat.jmlHariLibur();
//        System.out.println(i);
//
//        Buku b1 = new Buku();
//        b1.judul = "OPP 1";
//        Buku b2 = new Buku();
//        b1.judul = "OOP2";
//
//        List<Buku> bukubaru = new ArrayList<Buku>();
//        bukubaru.add(b1);
//        bukubaru.add(b2);
//        perpusSV.tambahBuku(bukubaru);
//        perpusPusat.printSemuaBuku();
//
//
//    }
//
//}