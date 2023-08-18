package com.boukreev.spring.projectboot.repositories;

import com.boukreev.spring.projectboot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer /** Тип Id */> {

    List<Person> findByName(String name);

    List<Person> findByNameOrderByAge(String name);

    List<Person> findByEmail(String email);

    List<Person> findByNameStartingWith(String start);

    List<Person> findByNameOrEmail(String name, String email);
}
