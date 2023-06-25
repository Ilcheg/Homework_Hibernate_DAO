package ru.netology.homework_hibernate_dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.homework_hibernate_dao.entity.Person;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, String> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeIsLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}