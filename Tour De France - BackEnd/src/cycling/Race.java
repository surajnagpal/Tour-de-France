package cycling;

import java.util.ArrayList;

public class Race {

    private Team[] teams;
    private String name;
    private int id;
    private String description;
    private ArrayList<Stage> stages = ArrayList<>();

    public Race(String name, Team[] teams, int id, String description){
        this.name = name;
        this.teams = teams;
        this.id = id;
        this.description = description;
    }
    @Override
    public Race(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

}
