import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CustomerService {
    private static Bank bank = new Bank();
    public static Card createCard(int nik, String name, String dateOfBirthInString,
                                  Card.Type type, int saldo, int pin

    ){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH):
        Date date;
        try{
            date = dateFormat.parse(dateOfBirthInString);
        }
        catch (Exception e){
            date = new Date();
        }
    }
//    Buat objek ownernya
    Owner owner = new Owner("nik", "name", "date");

    Random rand = new Random();
    int newCardNumber = rand.nextInt(999999);
    while (!bank.isCardNumberValid(newCardNumber)){
        newCardNumber = rand.nextInt(999999);
    }

//    newCardNumber harus dicek dulu valid tidaknya oleh bank
//    jika tidak valid, newCardNumber harus di generate ulang terus
//    jika valid, maka card bisa dicreate kemudian harus dimasukkan ke bank
//    return cardnya
//    do{
//        newCardNumber = rand.nextInt(9999999);
//        Boolean isValid = bank.isCardNumberValid(newCardNumber);
//    } while (!isValid);
//
    Card newCard = new Card(newCardNumber,owner, Card.Type );
    bank.addCard(card);

    return card;
}
