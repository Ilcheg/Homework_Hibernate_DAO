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

    @Override
    <S extends Person> S save(S entity);

    @Override
    Optional<Person> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(Person entity);

    @Override
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    void deleteAll(Iterable<? extends Person> entities);

    @Override
    void deleteAll();
}