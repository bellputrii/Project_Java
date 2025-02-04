public class Motorcycle extends Vehicle{
    public Motorcycle(String platnomor, String brand, String model){
        super(platnomor, brand, model);
    }

    public double hitungBiaya(double weight, double distance){
        return (weight * distance * 0.3) + 100;
    }
}
