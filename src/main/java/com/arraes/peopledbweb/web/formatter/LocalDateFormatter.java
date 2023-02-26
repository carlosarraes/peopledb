package com.arraes.peopledbweb.web.formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateFormatter implements Formatter<LocalDate> {
  private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

  @Override
  public String print(LocalDate object, java.util.Locale locale) {
    return dateTimeFormatter.format(object);
  }

  @Override
  public LocalDate parse(String text, java.util.Locale locale) {
    return LocalDate.parse(text, dateTimeFormatter);
  }
}
