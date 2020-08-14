package com.example.demowebapp.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 *  User Entity mapped with DB
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name="active")
    private boolean active;

    //  One To  One
    //@JoinColumn(name="address")
    //@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
    //private Address address;
    // oneToOne

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="studentid")
    @OrderColumn(name="street1")
    private List<Address> addresses;

    @Column(name="dob")
    private String dob;

    @Transient
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
