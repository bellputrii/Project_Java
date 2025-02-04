public class Card {

    public enum Type {
        DEBIT,
        CREDIT
    }
    private int cardNumber;
    private int saldo;
    private Owner owner;
    private int pin;
    private boolean isActive = true;
    private Type type;
//    private boolean validatePin = true;

    public Card (int cardNumber, int saldo, Owner owner, int pin, Type type) {
        this.cardNumber = cardNumber;
        this.saldo = saldo;
        this.owner = owner;
        this.pin = pin;
        this.type = type;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public int getSaldo() {
        return saldo;
    }

    public Owner getOwner() {
        return owner;
    }

    public int getPin() {
        return pin;
    }

    public boolean isActive() {
        return isActive;
    }

    public Type getType() {
        return type;
    }

    public boolean validatePin(int pin){
        return this.pin == pin;
    }


}
