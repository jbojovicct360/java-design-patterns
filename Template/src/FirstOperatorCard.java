public class FirstOperatorCard extends SIMCard{

    private final double SMS_PRICE = 10;

    public FirstOperatorCard(String number, double credit) {
        super(number, credit);
    }


    @Override
    public boolean canSendSMS(double credit) {
        return credit > this.SMS_PRICE;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("First operator sent message: " + message);
    }

}
