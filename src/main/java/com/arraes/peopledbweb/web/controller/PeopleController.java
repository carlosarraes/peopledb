package com.arraes.peopledbweb.web.controller;

import com.arraes.peopledbweb.biz.model.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {

  @GetMapping
  public String getPeople(Model model) {
    List<Person> people =
        List.of(
            new Person(10l, "Jake", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal(1000)),
            new Person(20l, "Sarah", "Smith", LocalDate.of(1960, 1, 1), new BigDecimal(2000)),
            new Person(30l, "Johnny", "Jackson", LocalDate.of(1970, 1, 1), new BigDecimal(3000)),
            new Person(40l, "Bobby", "Kim", LocalDate.of(1980, 1, 1), new BigDecimal(4000)),
            new Person(50l, "Tane", "McGuire", LocalDate.of(1990, 1, 1), new BigDecimal(5000)));
    model.addAttribute("people", people);
    return "people";
  }
}
