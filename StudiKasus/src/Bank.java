import java.util.List;

public class Bank {
    private String name;
    private List<Card> cards;

    public void addCard(Card card) {
        cards.add(card);
    }

    public Boolean isCardNumberValid(int newNumber) {
        for (Card card : cards) {
            if (card.getCardNumber() == newNumber)
                return false;
        }
        return true;
    }

}
