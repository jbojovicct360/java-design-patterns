public class TextFile extends File{

    public String text;

    public TextFile() {}

    public TextFile(String name, double size, String text) {
        super(name, size);
        this.text = text;
    }

    public TextFile(TextFile file) {
        super(file);
        if (file != null)
            text = file.text;
    }

    @Override
    public File clone() {
        return new TextFile(this);
    }

}
