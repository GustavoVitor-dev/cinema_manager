package model.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String name;
    private String location;
    private List<Auditorium> auditoriums;

    //*********************************************************************************
    //CONSTRUCTORS
    public Cine() {
        this.name = "";
        this.location = "";
        this.auditoriums = new ArrayList<>();
    }

    public Cine(String name, String location, List<Auditorium> auditoriums) {
        this.name = name;
        this.location = location;
        this.auditoriums = auditoriums;
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<Auditorium> getAuditoriums() { return auditoriums; }
    public void setAuditoriums(List<Auditorium> auditoriums) { this.auditoriums = auditoriums; }
}
