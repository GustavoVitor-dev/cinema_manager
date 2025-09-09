package model.people;
import model.tickets.Ticket;
import model.tickets.TicketType;
import model.films_and_sections.Section;

public class Viewer {
    private String fullName;
    private String idNumber;

    //*********************************************************************************
    //CONSTRUCTORS
    public Viewer() {
        this.fullName = "";
        this.idNumber = "";
    }

    public Viewer(String fullName, String idNumber) {
        this.fullName = fullName;
        this.idNumber = idNumber;
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    //*********************************************************************************
    //METHODS
    public Ticket buyTicket(Section section, TicketType type) {
        if (section.isAvailable()) {
            Ticket ticket = new Ticket(type);
            section.getTickets().add(ticket);
            return ticket;
        } else {
            System.out.println("Section unavailable or full!");
            return null;
        }
    }
}
