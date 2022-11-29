import java.time.LocalDate;
import java.time.Year;

public class CardAuthentication {

    public static boolean isCardNumberValid(CreditCard creditCard) {
        String creditCardNumber = creditCard.getCardNumber();
        if((creditCardNumber.startsWith("5") || creditCardNumber.startsWith("2")
            || creditCardNumber.startsWith("4") || creditCardNumber.startsWith("3")) && creditCardNumber.length() == 16)
            return true;
        return false;
    }

    public static boolean isCardExpired(CreditCard creditCard) {
        String expireDate = creditCard.getExpireDate();
        String expireMonth = expireDate.substring(0, 2);
        String expireYear = expireDate.length() > 2 ? expireDate.substring(expireDate.length() - 2) : expireDate;
        int currentYear = getCurrentYear();
        int currentMonth = getCurrentMonth();
        if (Integer.valueOf(expireYear) > currentYear ||
                (Integer.valueOf(expireYear) == currentYear && Integer.valueOf(expireMonth) > currentMonth)) {
            return false;
        }
        return true;
    }

    private static int getCurrentYear() {
        return Year.now().getValue() - 2000;
    }

    private static int getCurrentMonth() {
        LocalDate today = LocalDate.now();
        return today.getMonthValue();
    }

}
