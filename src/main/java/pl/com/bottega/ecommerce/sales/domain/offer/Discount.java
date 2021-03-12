package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private String cause;
    private Money value;

    public Discount(String cause, BigDecimal value) {
        this.cause = cause;
        this.value = new Money(value);
    }

    public String getCause() {
        return cause;
    }

    public Money getValue() {
        return value;
    }
}
