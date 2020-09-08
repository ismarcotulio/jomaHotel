
package core;

import java.util.List;

public class Room {
    private int number;
    private String type;
    private boolean status;


    public Room(int number, String type) {
        this.number = number;
        this.type = type;
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
