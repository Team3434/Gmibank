package gmibank.pojos;


    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
    private int id;
    private String name;
    private gmibank.pojos.Country country;

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


    public gmibank.pojos.Country getCountry() {
        return country;
    }
    public void setCountry(gmibank.pojos.Country country) {
        this.country = country;
    }


}
