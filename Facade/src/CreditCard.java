public class CreditCard {

    private String cardNumber;
    private String expireDate;
    private double moneyAmount;

    public CreditCard(String cardNumber, String expireDate, double moneyAmount) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.moneyAmount = moneyAmount;
    }

    public CreditCard() {}

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
