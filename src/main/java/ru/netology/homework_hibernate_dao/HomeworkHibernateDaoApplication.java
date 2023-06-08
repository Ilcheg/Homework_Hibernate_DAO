package ru.netology.homework_hibernate_dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.homework_hibernate_dao.entity.Person;

@SpringBootApplication
public class HomeworkHibernateDaoApplication implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(HomeworkHibernateDaoApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        //Ниже сохранение данных в таблицу для проверки кода
//        Person person1 = Person.builder()
//                .name("Sergei")
//                .surname("Titov")
//                .age(27)
//                .phoneNumber("79261112233")
//                .cityOfLiving("Moscow")
//                .build();
//        entityManager.persist(person1);
//
//        Person person2 = Person.builder()
//                .name("Ilia")
//                .surname("Turkovskiy")
//                .age(33)
//                .phoneNumber("79267771122")
//                .cityOfLiving("Spb")
//                .build();
//        entityManager.persist(person2);
//
//        Person person3 = Person.builder()
//                .name("Daria")
//                .surname("Ivanova")
//                .age(18)
//                .phoneNumber("79160008899")
//                .cityOfLiving("Moscow")
//                .build();
//        entityManager.persist(person3);
    }
}
