public class PaymentValidation {

    public static boolean validatePayment(CreditCard creditCard, double paymentAmount) {
        if (creditCard.getMoneyAmount() > paymentAmount)
            return true;
        return false;
    }

}
