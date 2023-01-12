package com.example.dcabackend.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Prod {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long prodId;
    private String prodName;

    private String manDate;

    private String expDate;
    private int price;

    public Prod(long prodId,String prodName, String manDate, String expDate, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manDate = manDate;
        this.expDate = expDate;
        this.price = price;
    }
    public Prod(){
        super();
    }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManDate() {
        return manDate;
    }

    public void setManDate(String manDate) {
        this.manDate = manDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", manDate=" + manDate +
                ", expDate=" + expDate +
                ", price=" + price +
                '}';
    }
}
