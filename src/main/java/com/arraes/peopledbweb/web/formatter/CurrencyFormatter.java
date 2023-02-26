package com.arraes.peopledbweb.web.formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class CurrencyFormatter implements Formatter<BigDecimal> {

  @Override
  public String print(BigDecimal object, Locale locale) {
    return NumberFormat.getCurrencyInstance(locale).format(object);
  }

  @Override
  public BigDecimal parse(String text, Locale locale) {
    return new BigDecimal(text);
  }
}
