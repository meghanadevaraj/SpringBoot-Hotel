package com.app.hotell.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingid;

    private LocalDate checkindate;
    private LocalDate checkoutdate;

    

    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "roomNo")
    private Rooms room;

    public Booking() {}

    public Booking(Long bookingid, LocalDate checkindate, LocalDate checkoutdate, Customer customer, Rooms room) {
        this.bookingid = bookingid;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
        this.customer = customer;
        this.room = room;
    }

    public Long getBookingid() {
        return bookingid;
    }

    public void setBookingid(Long bookingid) {
        this.bookingid = bookingid;
    }

    public LocalDate getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(LocalDate checkindate) {
        this.checkindate = checkindate;
    }

    public LocalDate getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(LocalDate checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }
}
