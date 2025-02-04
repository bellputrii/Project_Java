//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Trip{
    String destination;
    int price;
    String departureDate;
    int qty;

    Enum TypeTrip = FLIGHT, HOTEL, PACKAGE;

    Trip(String destination, int price, enum TypeTrip, int qty){
        this.destination = destination;
        this.price = price;
        this.TypeTrip = TypeTrip;
        this.qty = qty;
    }

    daftarPemesanan(){
        int IDBooking;

    }

}

class Customer{
    String name;
    String emailAdress;
    String pesanTrip;

    Customer(String name, String emailAdress){
        this.name = name;
        this.emailAdress = emailAdress;
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}