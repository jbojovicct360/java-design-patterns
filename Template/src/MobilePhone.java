import java.util.Random;
import java.util.Scanner;

public class MobilePhone {

    private SIMCard firstCard;
    private SIMCard secondCard;

    public MobilePhone(String firstNumber, String secondNumber) {
        Random random = new Random();
        firstCard = new FirstOperatorCard(firstNumber, random.nextDouble(900) + 100);
        secondCard = new SecondOperatorCard(secondNumber, random.nextDouble(900) + 100);
    }

    public void sendMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.println("\nChoose sim card to send message.\n1 - " +
                firstCard.getClass().getName() + "\n2 - " + secondCard.getClass().getName());
        int selectedOperator = scanner.nextInt();
        if (selectedOperator == 1) {
            firstCard.sendMessage(message);
        } else if (selectedOperator == 2) {
            secondCard.sendMessage(message);
        }
    }

}
