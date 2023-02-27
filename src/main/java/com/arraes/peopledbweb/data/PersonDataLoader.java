package com.arraes.peopledbweb.data;

import com.arraes.peopledbweb.biz.model.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

// @Component
public class PersonDataLoader implements ApplicationRunner {
  private PersonRepository personRepository;

  public PersonDataLoader(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    if (personRepository.count() == 0) {
      List<Person> people =
          List.of(
              new Person(
                  null,
                  "Pete",
                  "Snake",
                  LocalDate.of(1950, 1, 1),
                  "email@email.com",
                  new BigDecimal(1000)),
              new Person(
                  null,
                  "Jennifer",
                  "Smith",
                  LocalDate.of(1960, 1, 1),
                  "email@email.com",
                  new BigDecimal(2000)),
              new Person(
                  null,
                  "Vishnu",
                  "Jackson",
                  LocalDate.of(1970, 1, 1),
                  "email@email.com",
                  new BigDecimal(3000)),
              new Person(
                  null,
                  "Alice",
                  "Kim",
                  LocalDate.of(1980, 1, 1),
                  "email@email.com",
                  new BigDecimal(4000)),
              new Person(
                  null,
                  "Akira",
                  "McGuire",
                  LocalDate.of(1990, 1, 1),
                  "email@email.com",
                  new BigDecimal(5000)));

      personRepository.saveAll(people);
    }
  }
}
