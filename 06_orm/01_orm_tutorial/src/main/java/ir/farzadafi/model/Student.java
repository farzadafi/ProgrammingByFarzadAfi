package ir.farzadafi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_table")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class Student {
    @Id
    private int id;

//    @Column(length = 260, unique = true)
    private String name;
//    @Transient
    private int age;

//    @Temporal(TemporalType.TIME)
//    private Date birthDate;

//    @Enumerated(EnumType.STRING)
//    private Gender gender;
}