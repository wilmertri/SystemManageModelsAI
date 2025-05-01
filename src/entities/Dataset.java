package entities;

public class Dataset {
    private String name;
    private int size;
    private String format;
    private String license;

    public Dataset(String name, int size, String format, String license) {
        this.name = name;
        this.size = size;
        this.format = format;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "entities.Dataset [Name: " + name + ", Size: " + size + ", Format: " + format + ", License: " + license + "]";
    }
}
