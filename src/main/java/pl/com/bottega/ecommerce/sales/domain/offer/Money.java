package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {


    private String currency = "PLN";
    private BigDecimal amount;


    public Money(String currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    public Money multiply(BigDecimal amountToMultiply)
    {
        return new Money(currency,amount.multiply(amountToMultiply));
    }

    public Money subtract(Money money)
    {
        return new Money(currency,amount.subtract(money.getAmount()));
    }

}
