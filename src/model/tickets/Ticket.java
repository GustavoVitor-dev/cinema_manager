package model.tickets;
import model.tickets.TicketType;

public class Ticket {
    private String barcode;
    private TicketType type;
    private double price;

    //*********************************************************************************
    //CONSTRUCTORS
    public Ticket() {
        this.barcode = "";
        this.type = TicketType.FULL;
        this.price = calculatePrice();
    }

    public Ticket(TicketType type) {
        this.type = type;
        this.price = calculatePrice();
        this.barcode = generateBarcode();
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public TicketType getType() { return type; }
    public void setType(TicketType type) { this.type = type; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    //*********************************************************************************
    //METHODS
    public double calculatePrice() {
        return (type == TicketType.FULL) ? 20.0 : 10.0;
    }

    private String generateBarcode() {
        return "TCK" + System.currentTimeMillis();
    }
}
