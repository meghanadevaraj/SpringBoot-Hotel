package com.app.hotell.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Paymentid;

    private int Amount;
    private String PaymentMode;
    private String PaymentStatus;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    public Payment() {
    }

    public Payment(Long paymentid, int amount, String paymentMode, String paymentStatus, Booking booking) {
        this.Paymentid = paymentid;
        this.Amount = amount;
        this.PaymentMode = paymentMode;
        this.PaymentStatus = paymentStatus;
        this.booking = booking;
    }

    public Long getPaymentid() {
        return Paymentid;
    }

    public void setPaymentid(Long paymentid) {
        Paymentid = paymentid;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getPaymentMode() {
        return PaymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        PaymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
