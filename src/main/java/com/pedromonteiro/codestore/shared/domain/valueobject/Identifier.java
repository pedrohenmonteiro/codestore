package com.pedromonteiro.codestore.shared.domain.valueobject;

import java.util.Objects;
import java.util.UUID;


public class Identifier extends ValueObject {

private final String value;    

public Identifier(final String value) {
    Objects.requireNonNull(value);
    this.value = value;
}

public static Identifier unique() {
    return Identifier.from(UUID.randomUUID());
}

public static Identifier from(final String anId) {
    return new Identifier(anId);
}

public static Identifier from(final UUID anId) {
    return new Identifier(anId.toString().toLowerCase());
}

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
    Identifier other = (Identifier) obj;
    if (value == null) {
        if (other.value != null)
            return false;
    } else if (!value.equals(other.value))
        return false;
    return true;
}
    


}
