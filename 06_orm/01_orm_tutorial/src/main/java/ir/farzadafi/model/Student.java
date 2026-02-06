package ir.farzadafi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    private int id;
    @Column(length = 260, unique = true)

    private String name;
    @Transient
    private int age;

//    @Temporal(TemporalType.TIME)
//    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}