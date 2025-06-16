package com.app.hotell.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.app.hotell.Entity.Booking;
import com.app.hotell.Repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepo;

    public Booking createBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public Booking getBooking(Long id) {
        return bookingRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    public List<Booking> getAllBooking() {
        return bookingRepo.findAll();
    }

    public Booking updateBooking(Long id, Booking updatedBooking) {
        Booking existing = getBooking(id);
        existing.setCheckindate(updatedBooking.getCheckindate());
        existing.setCheckoutdate(updatedBooking.getCheckoutdate());
        existing.setCustomer(updatedBooking.getCustomer());
        existing.setRoom(updatedBooking.getRoom());  // ✅ updated to use room object
        return bookingRepo.save(existing);
    }

    public void deleteBooking(Long id) {
        bookingRepo.deleteById(id);
    }

    public Page<Booking> getBookingsPagedSorted(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return bookingRepo.findAll(pageable);
    }
}
