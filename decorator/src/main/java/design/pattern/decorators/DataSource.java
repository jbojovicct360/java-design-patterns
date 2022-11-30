package design.pattern.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
