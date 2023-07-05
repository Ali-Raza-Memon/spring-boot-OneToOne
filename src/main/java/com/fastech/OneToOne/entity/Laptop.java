package com.fastech.OneToOne.entity;

import javax.persistence.*;

@Entity
@Table(name = "Laptop_TBL")
public class Laptop {
    @Id
    private int laptopId;
    private String brand;


    @OneToOne
    @JoinColumn(name = "Student_id")
    private Student student;


}
