package com.arraes.peopledbweb.biz.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
  @Id @GeneratedValue private Long id;
  private String firstName;
  private String lastName;
  private LocalDate dob;
  private BigDecimal salary;
}
