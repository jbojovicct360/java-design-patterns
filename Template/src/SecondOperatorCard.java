public class SecondOperatorCard extends SIMCard {

    private final double SMS_PRICE = 8.5;

    public SecondOperatorCard(String number, double credit) {
        super(number, credit);
    }


    @Override
    public boolean canSendSMS(double credit) {
        return credit > this.SMS_PRICE;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Second operator sent message: " + message);
    }

}
