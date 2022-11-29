import java.util.ArrayList;

public class Publisher {

    private ArrayList<ConcreteSubscriber> subscribers = new ArrayList<>();

    public void subscribe(ConcreteSubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed to " + subscriber.getTvShow() + "!");
    }

    public void unsubscribe(ConcreteSubscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed!");
    }

    public void notify(String tvShow, String message) {
        System.out.println();
        System.out.println("***** " + tvShow + " *****\n");
        System.out.println(message);
        System.out.println("************************");
        for (ConcreteSubscriber subscriber : subscribers)
            if (subscriber.getTvShow().equalsIgnoreCase(tvShow)) {
                subscriber.update(message);
                System.out.println(subscriber.getName() + " got the message!");
            }
        System.out.println();
    }

}
