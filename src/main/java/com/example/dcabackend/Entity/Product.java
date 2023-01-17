package com.example.dcabackend.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long productId;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Date manufacturingDate;
    @Column(nullable = false)
    private Date expireDate;
    @Column(nullable = false)
    private float price;


}
