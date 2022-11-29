import java.util.ArrayList;
import java.util.List;

public class Package extends ConcreteItem implements CompositeElement {

    private double maxWeight;
    private List<Item> items = new ArrayList<>();

    public Package(double maxWeight) {
        super(0, 0);
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Item item) {
        if(item.getClass().equals(ConcreteItem.class) && item.getWeight() < maxWeight){
            items.add(item);
            this.setWeight(item.getWeight());
            this.setPrice(item.getPrice());
        }
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Package{" +
                "maxWeight=" + maxWeight +
                ", items=" + items +
                '}';
    }
}
