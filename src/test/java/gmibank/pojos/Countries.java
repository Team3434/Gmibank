package gmibank.pojos;

public class Countries {
    private int id;
    private String name;
    private String states;


    public Countries(int id, String name, String states){
        this.id=id;
        this.name=name;
        this.states=states;
    }

    public int getId() {
        return id;
    }


    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }





}
