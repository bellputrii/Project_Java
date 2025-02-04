import java.text.SimpleDateFormat;
import java.util.*;

enum TripType {
    FLIGHT, HOTEL, PACKAGE
}

class Trip {
    private String destination;
    private int price;
    private Date departureDate;
    private TripType tripType;
    private int qty;

    public Trip(String destination, int price, Date departureDate, TripType tripType, int qty) {
        this.destination = destination;
        this.price = price;
        this.departureDate = departureDate;
        this.tripType = tripType;
        this.qty = qty;
    }

    public String getDestination(){
        return destination;
    }

    public int getPrice(){
        return price;
    }

    public Date getDepartureDate(){
        return departureDate;
    }

    public TripType getTripType(){
        return tripType;
    }

    public int getQty(){
        return qty;
    }

    public void decreaseQty(){
        qty--;
    }

    public void increaseQty(){
        qty++;
    }
}

class Customer {

    private String fullName;
    private String emailAddress;
    public Customer(String fullName, String emailAddress){
        this.fullName = fullName;
        this.emailAddress = emailAddress;
    }
    public String getEmailAdress(){
        return emailAddress;
    }
}

class TravelAgent{
    private List<Trip> availableTrips = new ArrayList<>();
    private Map<String, Trip> bookedTrips = new HashMap<>();

    public void addTrip(Trip trip){
        availableTrips.add(trip);
    }

    public void showAvailableTrip(){
        int availableTripCount = 0;
        System.out.println("Terdapat " + getAvailableTripCount() + " trip yang masih tersedia :");
        for(Trip trip : availableTrips){
            if(trip.getQty() > 0) {
                SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.US);
                String formattedDate = formatter.format(trip.getDepartureDate());
                System.out.println("Destinasi: " + trip.getDestination() + " - - Keberangkatan: " + trip.getDepartureDate()
                        + " - - Harga: " + trip.getPrice() + " - - Qty: " + trip.getQty() + " - - Jenis: " +
                        trip.getTripType());
                availableTripCount++;
            }
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    private int getAvailableTripCount() {
        int count = 0;
        for(Trip trip : availableTrips){
            if(trip.getQty() > 0) {
                count++;
            }
        }
        return count;
    }

    public void bookTrip(Customer customer, Trip trip){
        if(trip.getQty() > 0 && !bookedTrips.containsKey(customer.getEmailAdress())) {
            trip.decreaseQty(); // Mengurangi qty
            String bookingId = generateBookingId(trip.getDestination(), trip.getTripType(), bookedTrips.size() + 1);
            bookedTrips.put(customer.getEmailAdress(), trip);
            System.out.println("Pemesanan berhasil dilakukan dengan booking id " + bookingId);
        } else if (trip.getQty() == 0){
            System.out.println("Pemesanan gagal, perjalanan ke " + trip.getDestination() + " telah habis terjual.");
        } else {
            System.out.println("Pemesanan gagal, pengguna telah memiliki pesanan pada trip yang sama dengan id "
                    + generateBookingId(trip.getDestination(), trip.getTripType(), bookedTrips.size() + 1));
        }
    }

    public void cancelBooking(String customerEmail, Trip trip){
        if (bookedTrips.containsKey(customerEmail) && bookedTrips.get(customerEmail).equals(trip)){
            trip.increaseQty(); // Menambah qty
            System.out.println("Pesanan dengan id booking " +
                    generateBookingId(trip.getDestination(), trip.getTripType(), bookedTrips.size() + 1) +
                    " berhasil dibatalkan");
            bookedTrips.remove(customerEmail);
        } else {
            System.out.println("Pesanan tidak ditemukan");
        }
    }

    private String generateBookingId(String destination, TripType tripType, int bookingNumber) {
        return String.format("00%s%02d%s%02d", destination, bookingNumber, tripType.name(), bookingNumber);
    }
}

public class Main {

    public static void main(String[] args) {
        TravelAgent agent = new TravelAgent();

        Trip paris = new Trip("Paris", 15000000, new Date(), TripType.FLIGHT, 2);
        Trip newYork = new Trip("New York", 20000000, new Date(), TripType.FLIGHT, 3);
        Trip london = new Trip("London", 18000000, new Date(), TripType.HOTEL, 10);
        Trip tokyo = new Trip("Tokyo", 8000000, new Date(), TripType.PACKAGE, 7);

        agent.addTrip(paris);
        agent.addTrip(newYork);
        agent.addTrip(london);
        agent.addTrip(tokyo);
        agent.showAvailableTrip();

//        System.out.println("-----------------------------------------------------------------------------------------");

        Customer resti = new Customer("Resti", "resti@gmail.com");
        Customer hanif = new Customer("Hanif", "hanif@gmail.com");
        Customer revan = new Customer("Revan", "revan@gmail.com");
        Customer aziz = new Customer("Aziz", "aziz@gmail.com");

        agent.bookTrip(resti, paris);
        agent.bookTrip(hanif, paris);
        agent.bookTrip(revan, newYork);
        agent.bookTrip(aziz, paris);
        agent.bookTrip(aziz, newYork);
        agent.bookTrip(aziz, newYork);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        agent.showAvailableTrip();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        agent.cancelBooking(resti.getEmailAdress(), paris);
        agent.cancelBooking(hanif.getEmailAdress(), paris);
        agent.cancelBooking(aziz.getEmailAdress(), paris);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        agent.showAvailableTrip();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}