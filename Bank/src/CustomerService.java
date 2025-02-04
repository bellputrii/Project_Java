import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CustomerService {

    private static Bank bank = new Bank();

    public static Card createCard(int nik,
        String name,
        String dateOfBirthInString,
        Card.Type type,
        int saldo,
        int pin) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy",
                Locale.ENGLISH);
        Date date ;
        try {
            date = dateFormat.parse(dateOfBirthInString);
        }
        catch (Exception e) {
            date = new Date();
        }

        // Buat object ownernya
        Owner owner = new Owner(nik, name, date);

        Random rand = new Random();

        int newCardNumber = rand.nextInt(999999);
        while (!bank.isCardNumberValid(newCardNumber)) {
            newCardNumber = rand.nextInt(999999);
        }

        Card card = new Card(newCardNumber, saldo, owner, pin,type);
        bank.addCard(card);

        return card;

        // newCardNumber harus dicek dulu valid tidaknya oleh bank
        // jika tidak valid, newCardNumber harus digenerate ulang terus
        // jika valid, maka card bisa dicreate kemudian harus dimasukkan ke bank


        //return cardnya

    }

    public static void activateCard(int cardNumber){
        bank.activateCard(cardNumber);
    }

    public static void printCardDetail(int cardNumber){
        Card card = bank.getCardDetails(cardNumber);
    }

    public static void withdraw(int cardNumber, int pin, int nominal){
        int uangDiambil = bank.withdraw(cardNumber, pin, nominal);
        System.out.println("Berhasil uang sejumlah: " + uangDiambil);
    }

    public void

}
