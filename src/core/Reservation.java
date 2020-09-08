
package core;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    
    private int number;
    private Room room;
    private List<Client> guests;
    private String entryDate;
    private String outDate;
    private boolean state;

    public Reservation(int number, Room room, Client guest, String entryDate, String outDate) {
        this.number = number;
        this.room = room;
        this.guests = new ArrayList<>();
        this.guests.add(guest);
        this.entryDate = entryDate;
        this.outDate = outDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Client> getGuests() {
        return guests;
    }

    public void setGuests(List<Client> guests) {
        this.guests = guests;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
}
