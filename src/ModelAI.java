public class ModelAI {
<<<<<<< HEAD
    protected String name;
    protected String type;
    protected String version;

    public ModelAI(String name, String type, String version){
=======

    protected String name;
    protected String type;
    protected float version;

    public ModelAI(String name, String type, float version){
>>>>>>> 80a42ab207049d71e2a90d1aee3a2d4044eb5ab3
        this.name = name;
        this.type = type;
        this.version = version;
    }

    public ModelAI(){
        this.name = "";
        this.type = "";
<<<<<<< HEAD
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
=======
        this.version = 1;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setVersion(float version){
        this.version = version;
    }

    public float getVersion(){
        return this.version;
    }


>>>>>>> 80a42ab207049d71e2a90d1aee3a2d4044eb5ab3
}
