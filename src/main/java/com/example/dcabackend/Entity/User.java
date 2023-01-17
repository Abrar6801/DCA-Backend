package com.example.dcabackend.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
public class User{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    @Column(nullable = false)
    private String businessName;
    @Column(nullable = false)
    private String ownerName;
    @Column(unique = true,nullable = false)
    private String drugLicence;
    @Column(unique = true,nullable = false)
    @Size(min=15,max=15)
    private String gst;

    @Column(nullable = false)
    @Size(min=4)
    private String password;
    @Column(unique = true,nullable = false)
    @Min(1000000000)
    @Max(9999999999L)
    private long phoneNumber;
    @Column(columnDefinition = "boolean default false")
    private boolean blocked;


}
