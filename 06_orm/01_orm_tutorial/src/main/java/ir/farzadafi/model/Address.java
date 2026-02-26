package ir.farzadafi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String country;
    private String city;

//    @OneToOne
//    private Student student;

//    @ManyToOne
//    private Student student;

    @ManyToMany
    private Set<Student> students = new HashSet<>();
}
