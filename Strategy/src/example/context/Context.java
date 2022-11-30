package example.context;

import example.interfaces.Discounter;
public class Context {
    private Discounter discounter;
    public Discounter getDiscounter() {
        return discounter;
    }
    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }
}
