public class ConcreteItem implements Item {

    private double weight;
    private double price;

    public ConcreteItem(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ConcreteItem{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
