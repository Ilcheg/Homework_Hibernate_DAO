package ru.netology.homework_hibernate_dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}
