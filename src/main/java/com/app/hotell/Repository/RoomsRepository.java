package com.app.hotell.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.hotell.Entity.Rooms;
@Repository
public interface RoomsRepository extends JpaRepository<Rooms,Integer> {
    
}