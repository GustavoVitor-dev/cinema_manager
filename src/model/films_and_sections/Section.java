package model.films_and_sections;
import model.cinema.Auditorium;
import model.tickets.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Section {
    private Date showTime;
    private boolean active;
    private Movie movie;
    private Auditorium auditorium;
    private List<Ticket> tickets;

    //*********************************************************************************
    //CONSTRUCTORS
    public Section() {
        this.showTime = new Date();
        this.active = true;
        this.movie = new Movie();
        this.auditorium = new Auditorium();
        this.tickets = new ArrayList<>();
    }

    public Section(Date showTime, Movie movie, Auditorium auditorium) {
        this.showTime = showTime;
        this.movie = movie;
        this.auditorium = auditorium;
        this.active = true;
        this.tickets = new ArrayList<>();
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public Date getShowTime() { return showTime; }
    public void setShowTime(Date showTime) { this.showTime = showTime; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }

    public Auditorium getAuditorium() { return auditorium; }
    public void setAuditorium(Auditorium auditorium) { this.auditorium = auditorium; }

    public List<Ticket> getTickets() { return tickets; }
    public void setTickets(List<Ticket> tickets) { this.tickets = tickets; }

    //*********************************************************************************
    //METHODS
    public void finalizeSection() { this.active = false; }

    public boolean isAvailable() {
        return active && tickets.size() < auditorium.getCapacity();
    }
}
