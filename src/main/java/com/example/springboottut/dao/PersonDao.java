package com.example.springboottut.dao;

import com.example.springboottut.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author r34g4n
 * @date 7/31/21 11:35 AM
 */
public interface PersonDao {
    int  insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
