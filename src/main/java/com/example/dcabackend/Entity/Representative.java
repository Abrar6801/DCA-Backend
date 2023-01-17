package com.example.dcabackend.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class Representative {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long representativeId;
    @Column(nullable = false)
    private String position;
    @Column(nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true,nullable = false)
    @Min(6000000000L)
    @Max(9999999999L)
    private long phoneNumber;
}
