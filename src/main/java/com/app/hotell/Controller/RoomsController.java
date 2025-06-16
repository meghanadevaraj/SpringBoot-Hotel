package com.app.hotell.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.hotell.Entity.Rooms;
import com.app.hotell.Service.RoomsService;

@RestController
@RequestMapping("/api/rooms")
public class RoomsController {

    @Autowired
    private RoomsService roomsService;

    @GetMapping("/rooms")
public ResponseEntity<Page<Rooms>> getAllRooms(
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "5") int size,
    @RequestParam(defaultValue = "roomNo") String sortBy) {

    Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
    Page<Rooms> roomPage = roomsService.getAllRooms(pageable);
    return ResponseEntity.ok(roomPage);
}

    @PostMapping
    public ResponseEntity<Rooms> create(@RequestBody Rooms room) {
        return new ResponseEntity<>(roomsService.createRoom(room), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rooms> get(@PathVariable int id) {
        return ResponseEntity.ok(roomsService.getRoom(id));
    }

    @GetMapping
    public ResponseEntity<List<Rooms>> getAll() {
        return ResponseEntity.ok(roomsService.getAllRooms());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rooms> update(@PathVariable int id, @RequestBody Rooms room) {
        return ResponseEntity.ok(roomsService.updateRoom(id, room));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        roomsService.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }
}
