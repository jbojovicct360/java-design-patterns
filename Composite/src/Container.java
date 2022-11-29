import java.util.ArrayList;
import java.util.List;

public class Container implements CompositeElement {

    private List<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void print() {
        System.out.println("Container={" + items + "}");
    }

}
