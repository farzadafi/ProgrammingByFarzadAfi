package ir.farzadafi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Entity
@Table(name = "student_table")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class Student {
    @Id
    //sequence generator
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
//    @SequenceGenerator(name = "student_generator", allocationSize = 20)

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //    @Column(length = 260, unique = true)
    private String name;
    //    @Transient
    private int age;

//    @OneToOne
//    private Address address;

//    @OneToMany
//    private List<Address> addressList = new ArrayList<>();

    @ManyToMany
    private Set<Address> addressSet = new HashSet<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Temporal(TemporalType.TIME)
//    private Date birthDate;

//    @Enumerated(EnumType.STRING)
//    private Gender gender;
}