package com.example.dcabackend.Entity;

import jakarta.persistence.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(unique = true)
    private long id;
    private String Bname;
    private String Pname;
    private String DrugL;
    private String GST;
    private String Password;
    private long PhNo;

    public  User(long id, String bname, String pname, String drugL, String gst, String password, long phNo) {
        this.id = id;
        Bname = bname;
        Pname = pname;
        DrugL = drugL;
        GST = gst;
        Password = password;
        PhNo = phNo;
    }
    public User(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getDrugL() {
        return DrugL;
    }

    public void setDrugL(String drugL) {
        DrugL = drugL;
    }

    public String getGST() {
        return GST;
    }

    public void setGST(String GST) {
        this.GST = GST;
    }

    public long getPhNo() {
        return PhNo;
    }

    public void setPhNo(long phNo) {
        PhNo = phNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Bname='" + Bname + '\'' +
                ", Pname='" + Pname + '\'' +
                ", DrugL='" + DrugL + '\'' +
                ", GST='" + GST + '\'' +
                ", PhNo=" + PhNo +
                '}';
    }



    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
