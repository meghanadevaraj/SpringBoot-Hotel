package com.app.hotell.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Customerid;
    private String Name;
    private String Email;
    private int Phoneno;
    private String Address;
    
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public Customer() {}
    
    public Customer(Long customerid, String name, String email, int phoneno, String address) {
        Customerid = customerid;
        Name = name;
        this.Email = email;
        this.Phoneno = phoneno;
        this.Address = address;
    }
    public Long getCustomerid() {
        return Customerid;
    }
    public void setCustomerid(Long customerid) {
        Customerid = customerid;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public int getPhoneno() {
        return Phoneno;
    }
    public void setPhoneno(int phoneno) {
        this.Phoneno = phoneno;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }

    

}
