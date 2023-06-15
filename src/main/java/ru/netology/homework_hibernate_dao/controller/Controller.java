package ru.netology.homework_hibernate_dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homework_hibernate_dao.entity.Person;
import ru.netology.homework_hibernate_dao.repository.Repository;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}
