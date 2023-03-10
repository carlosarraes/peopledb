package com.arraes.peopledbweb.biz.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

  @Id @GeneratedValue private Long id;

  @NotEmpty(message = "First name is required")
  private String firstName;

  @NotEmpty(message = "Last name is required")
  private String lastName;

  @Past(message = "Date of birth must be in the past")
  @NotNull(message = "Date of birth is required")
  private LocalDate dob;

  @Email(message = "Email must be valid")
  @NotEmpty(message = "Email is required")
  private String email;

  @DecimalMin(value = "1000.00", message = "Salary must be greater than $1000.00")
  @NotNull(message = "Salary is required")
  private BigDecimal salary;
}
