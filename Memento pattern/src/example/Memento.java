package example;

/**
 * Memento class
 */
public class Memento {

    /**
     * Originator state that's being saved to history
     */
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
