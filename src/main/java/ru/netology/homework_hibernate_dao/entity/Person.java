package ru.netology.homework_hibernate_dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@IdClass(Person.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persons")
public class Person implements Serializable {

    @Id
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
