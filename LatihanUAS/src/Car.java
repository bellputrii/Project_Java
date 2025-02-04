public class Car extends Vehicle{
    public Car(String platnomor, String brand, String model){
        super(platnomor, brand, model);
    }
    @Override
    public double hitungBiaya(double weight, double distance){
        return weight * distance * 0.05;
    //        diskon 5%
    }
}
