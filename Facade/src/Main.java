public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("5555666677778888", "11/23", 210);
        Person person = new Person("Petar Petrovic", creditCard);
        CreditCard creditCard1 = new CreditCard("3154587945694125", "01/24", 50);
        Person person1 = new Person("Zika Zikic", creditCard1);
        System.out.println(PaymentFacade.pay(person.getCreditCard(), person1, 100));
    }
}