package com.pedromonteiro.codestore.productadm.domain.entity;

import java.math.BigDecimal;

import com.pedromonteiro.codestore.shared.domain.entity.AggregateRoot;

public class Product extends AggregateRoot<ProductID>{

    private String name;
    private String description;
    private BigDecimal price;
    
    private Product(
       final ProductID id,
       final String aName,
       final String aDescription,
       final BigDecimal aPrice
        ) {
        super(id);
        this.name = aName;
        this.description = aDescription;
        this.price = aPrice;
    }


    public static Product newProduct(final String aName, final String aDescription, final BigDecimal aPrice) {
        final var id = ProductID.unique();

        return new Product(id, aName, aDescription, aPrice);
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public BigDecimal getPrice() {
        return price;
    }

    
    
}
