package com.arraes.peopledbweb.data;

import com.arraes.peopledbweb.biz.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {}
