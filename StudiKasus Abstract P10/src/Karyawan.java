public abstract class Karyawan {
    String name;
    double gaji;

    public Karyawan(String name, double gaji){
        this.name = name;
        this.gaji = gaji;
    }

    public abstract double hitungTHR();
    public void displayInfo(){
        System.out.println("Nama: " + name);
        System.out.println("Gaji: " + gaji);
        System.out.println("THR: " + hitungTHR(););
    }

}
