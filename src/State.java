import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<County> countries;

    public State(String name, ArrayList<County> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<County> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<County> countries) {
        this.countries = countries;
    }
}
