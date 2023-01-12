package com.example.dcabackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Reps {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long RepId;
    private String position;
    private String name;
    private String Email;
    private long PhNo;

    public Reps(long repId, String position, String name, String email, long phNo) {
        RepId = repId;
        this.position = position;
        this.name = name;
        Email = email;
        PhNo = phNo;
    }

    public Reps(){
        super();
    }

    public long getRepId() {
        return RepId;
    }

    public void setRepId(long repId) {
        RepId = repId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhNo() {
        return PhNo;
    }

    public void setPhNo(long phNo) {
        PhNo = phNo;
    }

    @Override
    public String toString() {
        return "Reps{" +
                "RepId=" + RepId +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", PhNo=" + PhNo +
                '}';
    }
}
