package com.fastech.OneToOne.entity;

import javax.persistence.*;

@Entity
@Table(name = "Student_TBL")
public class Student {
    @Id
    private int stdId;
    private String stdName;
    private String stdAbout;
    @OneToOne(mappedBy = "student")
    @JoinColumn(name = "Laptop_id")
    private Laptop laptop;
}
