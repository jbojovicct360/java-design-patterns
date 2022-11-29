import java.util.ArrayList;
import java.util.List;

public class Box extends ConcreteItem implements CompositeElement {

    private double maxWeight;
    private List<Item> items = new ArrayList<>();

    public Box(double maxWeight) {
        super(0, 0);
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Item item) {
        Class itemClass = item.getClass();
        if (itemClass.equals(ConcreteItem.class) || itemClass.equals(Package.class))
            items.add(item);
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + maxWeight +
                ", items=" + items +
                "}";
    }
}
