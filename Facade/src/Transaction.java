public class Transaction {

    public static String transferMoney(CreditCard creditCard, Person recipient, double amount) {
        recipient.getCreditCard().setMoneyAmount(recipient.getCreditCard().getMoneyAmount() + amount);
        creditCard.setMoneyAmount(creditCard.getMoneyAmount() - amount);
        return recipient.getName() + " recieved " + amount + " you sent!";
    }

}
