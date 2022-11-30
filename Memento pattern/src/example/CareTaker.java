package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker class
 */
public class CareTaker {

    /**
     * List of mementos -> history
     */
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
