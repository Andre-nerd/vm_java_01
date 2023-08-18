package com.boukreev.spring.projectboot.repositories;

import com.boukreev.spring.projectboot.models.Item;
import com.boukreev.spring.projectboot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item,Integer /** Тип Id */> {

    List<Item> findByItemName(String itemName);
    List<Item> findByOwner(Person owner);
}
