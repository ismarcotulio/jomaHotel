
package core;

public class Client {
    
    private int number;
    private String id;
    private String name;
    private String lastName;
    private String phone;

    public Client(int number, String id, String name, String lastName, String phone) {
        this.number = number;
        this.id = id;
        this.name = name;
        this. lastName = lastName;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
    
}
