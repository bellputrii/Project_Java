public class Salesman extends Karyawan{

    int target;
    int penjualan;
    public Salesman(String nama, double gaji){
        super(nama, gaji);
    }

//    perbaiki lagi methods dibawah ini
//    @Override
//    public double hitungTHR() {
//        if(penjualan > target){
//            return 2 * gaji;
//        }
//    }


    @Override
    public double hitungTHR() {
        return 2 * gaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
