public class ModelAI {

    protected String name;
    protected String type;
    protected float version;

    public ModelAI(String name, String type, float version){
        this.name = name;
        this.type = type;
        this.version = version;
    }

    public ModelAI(){
        this.name = "";
        this.type = "";
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


}
