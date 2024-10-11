package com.CSC340.Assignment4.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides the actual database transactions.
 */
@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer> {

    @Query(value = "select * from animals where species= %:species%", nativeQuery = true)
    List<Animal> getAnimalsBySpecies(String species);

    @Query(value = "select * from animals where name like %:string%", nativeQuery = true)
    List<Animal> getNameString(String string);
}
