package ru.netology.homework_hibernate_dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homework_hibernate_dao.entity.Person;
import ru.netology.homework_hibernate_dao.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> findByCity(@RequestParam("city") String city) {
        return personRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age-less-than")
    public List<Person> findByAgeIsLessThanOrderByAge(@RequestParam("age") int age) {
        return personRepository.findByAgeIsLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Person> findByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }
}
