package com.assignment3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String password;
    private String name;
    private String address;
    private String email;
    private String classs;
    private String phone;

    protected Student() {
    }

    public Student(String password, String name, String address, String email, String classs, String phone) {
        this.password = password;
        this.name = name;
        this.address = address;
        this.email = email;
        this.classs = classs;
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
