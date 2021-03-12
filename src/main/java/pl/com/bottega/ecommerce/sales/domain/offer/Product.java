package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String id;
    private String type;
    private String name;
    private Date snapshotDate;
    private Money price;

    public Product(String id, String type, String name, Date snapshotDate, BigDecimal price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.price=new Money(price);
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public Money getPrice() {
        return price;
    }
}
