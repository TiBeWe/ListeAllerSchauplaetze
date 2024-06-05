package ch.bbw.jpa.ListeAllerSchauplaetze.Room;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "room")
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;
    private String name;
    private String address;
    private String city;

    public Room() {
    }

    public Room(int room_id, String name, String address, String city) {
        this.room_id = room_id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
