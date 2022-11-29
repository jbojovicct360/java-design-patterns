public class Main {
    public static void main(String[] args) {
        ConcreteSubscriber s1 = new ConcreteSubscriber("Quentin Tarantino", "The Sopranos");
        ConcreteSubscriber s2 = new ConcreteSubscriber("Martin Scorsese", "Chernobyl");
        ConcreteSubscriber s3 = new ConcreteSubscriber("Bruce Willis", "Game of Thrones");
        ConcreteSubscriber s4 = new ConcreteSubscriber("Leonardo di Caprio", "The Sopranos");
        ConcreteSubscriber s5 = new ConcreteSubscriber("Ben Affleck", "Game of Thrones");

        Publisher netflix = new Publisher();

        netflix.subscribe(s1);
        netflix.subscribe(s2);
        netflix.subscribe(s3);
        netflix.subscribe(s4);
        netflix.subscribe(s5);

        netflix.notify("The Sopranos", "New episode of The Sopranos is on Netflix! Come check it out!");

        netflix.unsubscribe(s1);

        netflix.notify("Game of Thrones", "Game of Thrones has been ended!");
    }
}