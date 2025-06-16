package com.app.hotell.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.hotell.Entity.Rooms;
import com.app.hotell.Repository.RoomsRepository;

@Service
public class RoomsService {

    @Autowired
    private RoomsRepository roomsRepo;

    public Page<Rooms> getAllRooms(Pageable pageable) {
        return roomsRepo.findAll(pageable);
    }

    public Rooms createRoom(Rooms room) {
        return roomsRepo.save(room);
    }

    public Rooms getRoom(int id) {
        return roomsRepo.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
    }

    public List<Rooms> getAllRooms() {
        return roomsRepo.findAll();
    }

    public Rooms updateRoom(int id, Rooms updatedRoom) {
        Rooms existing = getRoom(id);
        existing.setRoomtype(updatedRoom.getRoomtype());
        existing.setAvailability(updatedRoom.getAvailability());
        existing.setFloor(updatedRoom.getFloor());
        return roomsRepo.save(existing);
    }

    public void deleteRoom(int id) {
        roomsRepo.deleteById(id);
    }
}
