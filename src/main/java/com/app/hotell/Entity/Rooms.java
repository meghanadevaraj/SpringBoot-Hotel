package com.app.hotell.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Rooms {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int RoomNo;
    private String Roomtype;
    private String Availability;
    private int Floor;

    public Rooms() {
    }
    
    
    public Rooms(int roomNo, String roomtype, String availability, int floor) {
        RoomNo = roomNo;
        Roomtype = roomtype;
        Availability = availability;
        Floor = floor;
    }
    public int getRoomNo() {
        return RoomNo;
    }
    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }
    public String getRoomtype() {
        return Roomtype;
    }
    public void setRoomtype(String roomtype) {
        Roomtype = roomtype;
    }
    public String getAvailability() {
        return Availability;
    }
    public void setAvailability(String availability) {
        Availability = availability;
    }
    public int getFloor() {
        return Floor;
    }
    public void setFloor(int floor) {
        Floor = floor;
    }
    
}
