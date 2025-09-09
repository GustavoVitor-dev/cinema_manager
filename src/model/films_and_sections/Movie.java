package model.films_and_sections;

public class Movie {
    private String title;
    private int duration;

    //*********************************************************************************
    //CONSTRUCTORS
    public Movie() {
        this.title = "";
        this.duration = 0;
    }

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
}
