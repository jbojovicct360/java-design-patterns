public class PaymentFacade {

    public static String pay(CreditCard creditCard, Person recipient, double amount) {
        if (!CardAuthentication.isCardExpired(creditCard) &&
                CardAuthentication.isCardNumberValid(creditCard) &&
                PaymentValidation.validatePayment(creditCard, amount) &&
                ValidateRecipient.isRecipientCardValid(recipient)) {
            return Transaction.transferMoney(creditCard, recipient, amount);
        }
        return "Payment denied!";
    }

}
