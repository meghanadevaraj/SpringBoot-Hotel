package com.app.hotell.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.hotell.Entity.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    
}
