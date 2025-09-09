package model.cinema;

public class Auditorium {
    private int id;
    private int capacity;

    //*********************************************************************************
    //CONSTRUCTORS
    public Auditorium() {
        this.id = 0;
        this.capacity = 0;
    }

    public Auditorium(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    //*********************************************************************************
    //GETTERS AND SETTERS
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
