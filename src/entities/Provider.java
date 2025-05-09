package entities;

public class Provider {

    private int id;
    private String name;
    private String website;
    private Country country;

    public Provider(int id, String name, String website, Country country){
        this.id = id;
        this.name = name;
        this.website = website;
        this.country = country;
    }

    public Provider(int id, String name, String website){
        this.id = id;
        this.name = name;
        this.website = website;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "entities.Provider [ID: " + id + ", Name: " + name + ", Website: " + website +", entities.Country: " + country + "]";
    }
}
