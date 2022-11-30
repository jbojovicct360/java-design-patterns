package design.pattern;

import design.pattern.decorators.*;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("src/main/java/design/pattern/out/OutputDemo.txt");

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(fileDataSource)
        );

        encoded.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(fileDataSource.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}