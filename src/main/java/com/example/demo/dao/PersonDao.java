package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    //metoda dodająca osobę po id
    int insertPerson(UUID id, Person person);

    //metoda dodająca osobę z generowanym randomowym id
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
}
