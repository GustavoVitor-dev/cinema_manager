package model.people;
import model.tickets.Ticket;
import model.tickets.TicketType;
import model.films_and_sections.Section;

public class Attendant {
    private String employeeName;
    private String registration;

    //*********************************************************************************
    //CONSTRUCTORS
    public Attendant() {
        this.employeeName = "";
        this.registration = "";
    }

    public Attendant(String employeeName, String registration) {
        this.employeeName = employeeName;
        this.registration = registration;
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public String getRegistration() { return registration; }
    public void setRegistration(String registration) { this.registration = registration; }

    //*********************************************************************************
    //METHODS
    public Ticket processSale(Viewer viewer, Section section, TicketType type) {
        return viewer.buyTicket(section, type);
    }
}
