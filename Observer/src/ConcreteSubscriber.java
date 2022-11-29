public class ConcreteSubscriber implements Subscriber {

    private String name;
    private String tvShow;
    private String message;

    public ConcreteSubscriber(String name, String tvShow) {
        super();
        this.name = name;
        this.tvShow = tvShow;
        this.message = "No message!";
    }

    @Override
    public void update(String message) {
        this.message = message;
    }

    public String getTvShow() {
        return tvShow;
    }

    public String getName() {
        return name;
    }

}
