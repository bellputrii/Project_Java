public class Truck extends Vehicle{
    public Truck(String platnomor, String brand, String model){
        super(platnomor, brand, model);
    }

    @Override
    public double hitungBiaya(double weight, double distance){
        return weight * distance * 0.1;
    }
}
