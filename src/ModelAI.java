public class ModelAI {
    protected String name;
    protected String type;
    protected String version;

    public ModelAI(String name, String type, String version){
        this.name = name;
        this.type = type;
        this.version = version;
    }

    public ModelAI(){
        this.name = "";
        this.type = "";
        this.version = "1.0";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Type: " + type
                + ", Version: " + version;
    }
}
