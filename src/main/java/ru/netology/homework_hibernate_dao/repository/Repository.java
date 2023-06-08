package ru.netology.homework_hibernate_dao.repository;

import jakarta.persistence.EntityManager;
import ru.netology.homework_hibernate_dao.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    public List<Person> getPersonsByCity(String city, EntityManager entityManager) {
        return entityManager.createQuery("select e from Person e where e.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}