


class Vehicle {
    private String brand;
    private double rentalPrice;
    private int year;

    public Vehicle(String brand, double rentalPrice, int year) {
        this.brand = brand;
        this.rentalPrice = rentalPrice;
        this.year = year;
    }

    double discountYear(){
        double discount = 0.0;
        if (year < 2010){
            discount += 0.1 * rentalPrice;
        }
        return discount;
    }

    public void displayInfo() {
        double discount = discountYear();
        double discountedPrice = rentalPrice - discount;

        System.out.println("Detail Kendaraan:");
        System.out.println("Merk: " + brand);
        System.out.println("Tahun: " + year);
        System.out.println("Harga Sewa: " + rentalPrice);
        System.out.println("Diskon: " + discount);
        System.out.println("Harga sewa setelah diskon: " + discountedPrice);
        System.out.println("---------------------------------------------------");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String brand, int year, double rentalPrice, int cargoCapacity) {
        super(brand, rentalPrice, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    double discountYear(){
        double discount = super.discountYear();

        if (cargoCapacity > 2000){
            discount += 0.1 * getRentalPrice();
        }
        return discount;
    }

    @Override
    public void displayInfo() {
        double discount = discountYear();
        double discountedPrice = getRentalPrice() - discount;

        System.out.println("Detail Truk:");
        System.out.println("Merk: " + getBrand());
        System.out.println("Tahun: " + getYear());
        System.out.println("Harga Sewa: " + getRentalPrice());
        System.out.println("Diskon: " + discount);
        System.out.println("Harga sewa setelah diskon: " + discountedPrice);
        System.out.println("---------------------------------------------------");
    }

}
class Car extends Vehicle{
    enum CarType{
        CITYCAR,
        FAMILYCAR,
        PREMIUMCAR
    }
    CarType type;

    public Car(String brand, int year, double rentalPrice, CarType type) {
        super(brand, rentalPrice, year);
        this.type = type;
    }

    @Override
    double discountYear(){
        double discount = super.discountYear();

        if (type == CarType.FAMILYCAR) {
            discount += 0.05 * getRentalPrice();
        } else if (type == CarType.PREMIUMCAR){
            discount += 0.1 * getRentalPrice();
        }
        return discount;
    }
    @Override
    public void displayInfo() {
        double discount = discountYear();
        double discountedPrice = getRentalPrice() - discount;

        System.out.println("Detail Mobil:");
        System.out.println("Merk: " + getBrand());
        System.out.println("Tahun: " + getYear());
        System.out.println("Harga Sewa: " + getRentalPrice());
        System.out.println("Tipe Mobil: " + type);
        System.out.println("Diskon: " + discount);
        System.out.println("Harga sewa setelah diskon: " + discountedPrice);
        System.out.println("---------------------------------------------------");
    }

}

public class Main {
    public static void main(String[] args) {

        Car innova = new Car("Innova Reborn", 2015, 500.0, Car.CarType.PREMIUMCAR);
        Car avanza = new Car("Avanza", 2009, 300.0, Car.CarType.FAMILYCAR);
        Car brio = new Car("Honda Brio", 2012, 300.0, Car.CarType.CITYCAR);

        innova.displayInfo();
        avanza.displayInfo();
        brio.displayInfo();

        Truck isuzu = new Truck("Isuzu", 2013, 500.0, 1500);
        Truck volvo = new Truck("Volvo", 2013, 650.0, 2500);
        Truck hino = new Truck("Hino", 2005, 800.0, 4000);
        Truck mitsubishi = new Truck("Mitsubishi", 2010, 850.0, 4000);

        isuzu.displayInfo();
        volvo.displayInfo();
        hino.displayInfo();
        mitsubishi.displayInfo();
    }
}