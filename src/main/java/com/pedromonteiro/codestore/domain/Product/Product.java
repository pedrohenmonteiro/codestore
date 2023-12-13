package com.pedromonteiro.codestore.domain.Product;

import java.math.BigDecimal;

import com.pedromonteiro.codestore.domain.AggregateRoot;

public class Product extends AggregateRoot<ProductID>{

    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    
    private Product(
       final ProductID id,
       final String aName,
       final String aDescription,
       final BigDecimal aPrice,
       final int aStock
        ) {
        super(id);
        this.name = aName;
        this.description = aDescription;
        this.price = aPrice;
        this.stock = aStock;
    }


    public static Product newProduct(final String aName, final String aDescription, final BigDecimal aPrice, final int aStock) {
        final var id = ProductID.unique();

        return new Product(id, aName, aDescription, aPrice, aStock);
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

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
