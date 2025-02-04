class Pegawai {
    private String nama;
    private String departemen;
    private char jenisKelamin;
    private double gaji;
    private int cuti;
    private String nip;

    public Pegawai(String nama, String departemen, char jenisKelamin) {
        this.nama = nama;
        this.departemen = departemen;
        this.jenisKelamin = jenisKelamin;
        this.cuti = 12; // Set cuti normal 12 hari
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setCuti(int cuti) {
        this.cuti += cuti; // Menambahkan cuti tambahan ke cuti normal
    }

    public void setCuti(String jenisCuti) {
        if (jenisCuti.equals("pernikahan")) {
            this.cuti += 2;
        } else if (jenisCuti.equals("persalinan")) {
            if (jenisKelamin == 'P')
                this.cuti += 90;
            else
                this.cuti += 3;
        }
    }

    public void setNip(String nip) {
        if ((nip.startsWith("P") && this instanceof Pegawai) ||
                (nip.startsWith("M") && this instanceof Manager) ||
                (nip.startsWith("S") && this instanceof Salesman)) {
            this.nip = nip;
        } else {
            System.out.println("NIP tidak valid untuk jenis pegawai ini.");
        }
    }

    public void displayInfo() {
        System.out.println("Jabatan : Pegawai");
        System.out.println("Nama : " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji : " + gaji);
        System.out.println("THR : " + hitungTHR());
        System.out.println("Cuti : " + cuti);
        System.out.println("= = = = = = = = = = = = = = =");
    }

    public double hitungTHR() {
        return gaji;
    }
}

class Manager extends Pegawai {
    public Manager(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    @Override
    public double hitungTHR() {
        return super.hitungTHR() * 2;
    }
}

class Salesman extends Pegawai {
    private int target;
    private int penjualan;

    public Salesman(String nama, String departemen, char jenisKelamin) {
        super(nama, departemen, jenisKelamin);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public double hitungTHR() {
        if (penjualan >= target)
            return super.hitungTHR() * 2;
        else
            return super.hitungTHR();
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Diza", "HRD", 'P');
        pegawai1.setGaji(1000000);
        pegawai1.setCuti(10); // Tambah cuti 10 hari ke cuti normal 12 hari
        pegawai1.setNip("P0001");
        pegawai1.displayInfo();

        Pegawai pegawai2 = new Pegawai("Raihan", "Product", 'L');
        pegawai2.setGaji(1500000);
        pegawai2.setCuti("pernikahan"); // Tambah cuti pernikahan 2 hari ke cuti normal 12 hari
        pegawai2.setNip("P0002");
        pegawai2.displayInfo();

        Manager manager = new Manager("Nayla", "Operational", 'P');
        manager.setGaji(2000000);
        manager.setCuti("persalinan"); // Tambah cuti persalinan 90 hari ke cuti normal 12 hari
        manager.setNip("M0003");
        manager.displayInfo();

        Salesman salesman1 = new Salesman("Fauzan", "Marketing", 'L');
        salesman1.setGaji(2500000);
        salesman1.setTarget(100);
        salesman1.setPenjualan(120);
        salesman1.setCuti("persalinan"); // Tambah cuti persalinan 3 hari ke cuti normal 12 hari
        salesman1.setNip("S0004");
        salesman1.displayInfo();
    }
}
