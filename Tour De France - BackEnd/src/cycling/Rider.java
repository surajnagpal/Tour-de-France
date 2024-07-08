package cycling;

import java.util.UUID;

public class Rider {
    private String name;
    private int id;
    private Integer riderYob;

    public Rider (String name, int id, int riderYob) {
        this.name = name;
        this.id = id;
        this.riderYob = riderYob;
    }
    is this working

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public int getRideryob() {
        return riderYob;
    }
}