public class Manager extends Karyawan{
    public Manager(String name, double gaji){
        super(name, gaji);
    }

    @Override
    public double hitungTHR() {
        return 3 * gaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
