import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Card> cards= new ArrayList<>();

    public void addCard(Card card) {
       cards.add(card);
    }

    public Boolean isCardNumberValid(int newNumber) {
        for (Card card : cards) {
            if(card.getCardNumber() == newNumber) {
                return false;
            }
        }
        return true;
    }

    public Card getCardDetails(int cardNumber){
        Card card = searchCard(cardNumber);
        System.out.println("Nomor Kartu: " + card.getCardNumber() + " , owner: " + card.getOwner() + " , saldo" + card.getSaldo() );
        return card;
    }

    public int withdraw(int id, int pin, int nominal){
        Card card = searchCard(id);
        if(card!=null){
            if(card.validatePin(pin)){
                return takeMoney(card, nominal);
            } else{
                System.out.println("Pin tidak valid");
                return 0;
            }
        }
        else{
            System.out.println("Kartu tidak ditemukan");
        }
    }

    private int takeMoney(Card card, int nominal){
        if(isAvailable(card.getSaldo(), nominal)){
            card.setSaldo(card.setSaldo() -nominal);
            System.out.println("Saldo sekarang: " + card.getSaldo());
            return nominal;
        } else {
            System.out.println();
        }
    }

    private boolean isAvailable(int balance, int nominal){
        return balance >= nominal;
    }

    private Card searchCard(int cardNumber){
        for (Card card : cards){
            if(card.getCardNumber() == cardNumber){
                return card;
            }
        }
    }
}
