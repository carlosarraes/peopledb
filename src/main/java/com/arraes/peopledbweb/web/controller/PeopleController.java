package com.arraes.peopledbweb.web.controller;

import com.arraes.peopledbweb.biz.model.Person;
import com.arraes.peopledbweb.data.PersonRepository;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/people")
public class PeopleController {
  private PersonRepository personRepository;

  public PeopleController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @ModelAttribute("people")
  public Iterable<Person> getPeople() {
    return personRepository.findAll();
  }

  @ModelAttribute
  public Person getPerson() {
    return new Person();
  }

  @GetMapping
  public String showPeoplePage() {
    return "people";
  }

  @PostMapping
  public String savePerson(@Valid Person person, Errors errors) {
    System.out.println("person = " + person);
    if (!errors.hasErrors()) {
      personRepository.save(person);
      return "redirect:people";
    }
    return "people";
  }

  @PostMapping(params = "delete=true")
  public String deletePeople(@RequestParam Optional<List<Long>> selections) {
    System.out.println("selections = " + selections);
    if (selections.isPresent()) {
      personRepository.deleteAllById(selections.get());
    }
    return "redirect:people";
  }
}
