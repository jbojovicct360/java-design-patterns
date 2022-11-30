public class ByteFile extends File {

    public String bytes;

    public ByteFile(String name, double size, String bytes) {
        super(name, size);
        this.bytes = bytes;
    }

    public ByteFile() {}

    public ByteFile(ByteFile file) {
        super(file);
        if (file != null)
            bytes = file.bytes;
    }

    @Override
    public File clone() {
        return new ByteFile(this);
    }


}
