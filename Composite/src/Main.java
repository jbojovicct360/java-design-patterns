public class Main {
    public static void main(String[] args) {
        ConcreteItem item = new ConcreteItem(0.50, 1.50);
        ConcreteItem item1 = new ConcreteItem(1.24, 6.51);
        Package package1 = new Package(3);
        package1.add(item);
        package1.add(item1);
        ConcreteItem item2 = new ConcreteItem(1.39, 1.23);
        Package package2 = new Package( 2.74);
        package2.add(item2);
        Box box = new Box(5);
        box.add(package1);
        box.add(item2);
        Box box1 = new Box(8.2);
        box1.add(package2);
        Package package3 = new Package(6);
        Container container = new Container();
        container.add(box);
        container.add(box1);
        container.add(package3);
        container.print();
    }
}