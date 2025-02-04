public class Main {
    public static void main(String[] args){
        Vehicle[] vehicles = {
                new Car("B 123 AB", "Toyota", "Corolla"),
                new Truck("A 178 BA", "Mitsubishi", "Fuso"),
                new Motorcycle("D 123 C", "Honda", "CBR")
        };
        double weight = 100;
        double distance = 50;
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getBrand() + " " + v.getModel());
            System.out.println("Shipping Cost: " + v.hitungBiaya(weight, distance));
            System.out.println();
        }
    }
}