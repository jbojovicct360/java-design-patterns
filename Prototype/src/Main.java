public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("someTextFile.txt", 157, "This is some text!");
        TextFile textFile1 = (TextFile) textFile.clone();
        ByteFile byteFile = new ByteFile("someByteFile.bin", 350, "100100110");
        ByteFile byteFile1 = (ByteFile) byteFile.clone();
        System.out.println("Text in first text (" + textFile.name + ") file: " + textFile.text);
        System.out.println("Text in second text (" + textFile1.name + ") file: " + textFile1.text);
        System.out.println("First and second text files are equal: " + textFile.equals(textFile1));
        System.out.println("Bytes in first byte (" + byteFile.name + ") file: " + byteFile.bytes);
        System.out.println("Bytes in second byte (" + byteFile1.name + ") file: " + byteFile1.bytes);
        System.out.println("First and second byte files are equal: " + byteFile.equals(byteFile1));
    }
}