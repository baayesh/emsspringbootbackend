package net.javaemployeemgt.emsbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
//    Variables for class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

//    relate to the database columns
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

}



