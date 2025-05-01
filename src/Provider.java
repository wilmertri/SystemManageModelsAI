public class Provider {

    private int id;
    private String name;
    private String website;
    private String country;

    public Provider(int id, String name, String website, String country){
        this.id = id;
        this.name = name;
        this.website = website;
        this.country = country;
    }

    public Provider(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
