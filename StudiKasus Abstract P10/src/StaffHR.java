public class StaffHR extends Karyawan{
    public StaffHR(String name, double gaji){
        super(name, gaji);
    }

    @Override
    public double hitungTHR() {
        return 2 * gaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
