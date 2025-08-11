package com.skylerlink.OLISApp.repository;

import com.skylerlink.OLISApp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
