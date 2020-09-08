package core;

import core.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Hotel {

    
    private String name;
    private List<Room> rooms;
    private List<Client> clients;
    private List<Reservation> reservations;
    
    public Hotel(){
        this.rooms = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }
    
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
    public void addClient(int number, String id, String name, String lastName, String phone){
        clients.add(new Client(number, id, name,lastName, phone));
    }
    
    
    
    public Client getClient(String id){
        for(Client element: this.clients){
            if(element.getId().equals(id)){
                return element;
            }
        }
        return null;
    }
    
    
    public void printClients(){
        for(Client client: this.clients){
            System.out.println("");
            System.out.println("El numero de cliente es "+client.getNumber());
            System.out.println("La identidad es "+client.getId());
            System.out.println("El nombre es "+client.getName());
            System.out.println("El apellido es "+client.getLastName());
            System.out.println("El numero de telefono es "+client.getPhone());
        }
    }
    
    public int lastIndexClient(){
        int size = this.clients.size();
        int count = 1;
        
        for(Client client: this.clients){
            if(count == size){
                return client.getNumber()+1;
            }
            count++;
        }
        
        return 0;
    }
    
    public boolean searchIdClient( String id){
        boolean state = false;
        for(Client client: this.clients){
            if(client.getId().equals(id)){
                state = true;
                break;
            }
        }
        
        return state;
    }
    
    public void addRoom(int number, String type) {
        if( type == "simple" | type == "double" ){
            rooms.add(new Room(number, type));
        }
        
    }
    
    public Room getRoom(int number){
        for(Room element: this.rooms){
            if(element.getNumber() == number){
                return element;
            }
        }
        return null;
    }
    
    public void printRooms(){
        for(Room room: this.rooms){
            System.out.println("");
            System.out.println("Habitacion numero "+room.getNumber());
            System.out.println("tipo "+room.getType());
        }
    }
    
    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    
    public void serRoomStatus(Room room, boolean status){
        String roomNumberTemp;
        String roomNumber = String.format("%s", room.getNumber());
        for(Room roomTemp: this.rooms){
            roomNumberTemp = String.format("%s", roomTemp.getNumber());
            if(roomNumberTemp.equals(roomNumber)){
                roomTemp.setStatus(status);
                break;
            }
        }
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    public void addReservation(int number, Room room, Client guest, String entryDate, String outDate){
        reservations.add(new Reservation(number, room, guest, entryDate, outDate));
        this.serRoomStatus(room, true);
    }
    
    public void printReservations(){
        for( Reservation reservation: this.reservations ){
            System.out.println("");
            System.out.println("reservacion numero "+reservation.getNumber());
            System.out.println("habitacion "+reservation.getRoom().getNumber());
            System.out.println("huesped de nombre "+reservation.getGuests().get(0).getName());
        }
    }
    
    public int lastIndexReservation(){
        int size = this.reservations.size();
        int count = 1;
        
        for(Reservation reservation: this.reservations){
            if(count == size){
                return reservation.getNumber()+1;
            }
            count++;
        }
        
        return 0;
    }
    
    public boolean searchBetweenDatesReservation(Date entry_date, Date out_date, Room room){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date entry_date_reservation = null;
        Date out_date_reservation = null;
        boolean state = false;
        
        for(Reservation reservation: this.reservations ){
            if(reservation.getRoom().getNumber() == room.getNumber()){
                try{
                    entry_date_reservation = dateFormat.parse(reservation.getEntryDate());
                    out_date_reservation = dateFormat.parse(reservation.getOutDate());
                }catch(Exception e){}
                if((entry_date.after(entry_date_reservation) &&
                   entry_date.before(out_date_reservation)) |
                   entry_date.compareTo(entry_date_reservation) == 0 |
                   entry_date.compareTo(out_date_reservation) == 0
                ){
                    //System.out.println("La fecha: "+entry_date);
                    //System.out.println("Esta entre: "+entry_date_reservation);
                    //System.out.println("o entre: "+out_date_reservation);

                   state = true;
                   break;
                }
                if((out_date.after(entry_date_reservation) &&
                    out_date.before(out_date_reservation)) |
                    out_date.compareTo(entry_date_reservation) == 0 |
                    out_date.compareTo(out_date_reservation) == 0
                ){
                        //System.out.println("La fecha: "+out_date);
                        //System.out.println("Esta entre: "+entry_date_reservation);
                        //System.out.println("o entre: "+out_date_reservation);
                       state = true;
                       break;
                }
            }
             
        }
        return state;

    }
    
    public void removeReservation(int number){
        int count = 0;
        Reservation reservationTemp;
        Room roomTemp;
        int indexRoom;
        Room room;
        for(Reservation reservation: this.reservations){
            if(reservation.getNumber() == number){
                break;
            }
            count++;
        }
        reservationTemp = this.reservations.remove(count);
        roomTemp = reservationTemp.getRoom();
        indexRoom = this.rooms.indexOf(roomTemp);
        room = this.rooms.get(indexRoom);
        room.setStatus(true);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
