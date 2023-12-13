package com.pedromonteiro.codestore.productadm.domain.entity;

import java.util.Objects;
import java.util.UUID;

import com.pedromonteiro.codestore.shared.domain.valueobject.Identifier;


public class ProductID extends Identifier{
    
    private final String value;

    public ProductID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static ProductID unique() {
        return ProductID.from(UUID.randomUUID());
    }

    public static ProductID from(final String anId) {
        return new ProductID(anId);
    }

     public static ProductID from(final UUID anId) {
        return new ProductID(anId.toString().toLowerCase());
    }

    @Override
    public String getValue() {
        return value;
    }
    
      @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductID other = (ProductID) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
    
}
