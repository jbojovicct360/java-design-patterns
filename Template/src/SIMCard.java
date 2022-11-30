public abstract class SIMCard {

    String number;
    double credit;

    public SIMCard(String number, double credit) {
        this.number = number;
        this.credit = credit;
    }

    public boolean sendSMS(String message, double smsPrice) {
        if (canSendSMS(this.credit)) {
            credit -= smsPrice;
            sendMessage(message);
            return true;
        }
        return false;
    }

    public abstract boolean canSendSMS(double credit);

    public abstract void sendMessage(String message);

}
