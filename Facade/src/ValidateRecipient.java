public class ValidateRecipient {

    public static boolean isRecipientCardValid(Person person) {
        CreditCard creditCard = person.getCreditCard();
        return CardAuthentication.isCardNumberValid(creditCard) && !CardAuthentication.isCardExpired(creditCard);
    }

}
