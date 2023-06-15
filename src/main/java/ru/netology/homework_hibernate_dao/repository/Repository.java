package ru.netology.homework_hibernate_dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.homework_hibernate_dao.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select e from Person e where e.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}