public abstract class File {

    public String name;
    public double size;

    public File() {}

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public File(File file) {
        if (file != null) {
            this.name = file.name;
            this.size = file.size;
        }
    }

    public abstract File clone();

}
