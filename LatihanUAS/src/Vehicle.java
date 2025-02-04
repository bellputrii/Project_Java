public class Vehicle {
    private String platnomor;
    private String brand;
    private String model;
    public Vehicle(String platnomor, String brand, String model){
        this.platnomor = platnomor;
        this.brand = brand;
        this.model = model;
    }

    public String getPlatnomor() {
        return platnomor;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public double hitungBiaya(double berat, double jarak){
        return 0;
    }
}
