package cycling;

import java.time.LocalDateTime

public class Stage {

    private String name;
    private int id;
    private double length;
    private String description;
    private LocalDateTime startTime;
    private StageType type;

    public Stage (String name, int id, double length, String description, LocalDateTime startTime, StageType type) {
        this.name = name;
        this.length = length;
        this.description = description;
        this.startTIme = startTime;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getLength() {
        return length;
    }
    public String getDescription(){
        return description;
    }
    public LocalDateTime getStarttime() {
        return startTime;
    }
    public StageType getType(){
        return type;
    }
}
