package com.pedromonteiro.codestore.domain;

import java.util.Objects;
import java.time.Instant;

public abstract class Entity<ID extends Identifier> {
    
    private final ID id;
    private Instant createdAt;
    private Instant updatedAt;

    public Entity(final ID id) {
        Objects.requireNonNull(id, "'id' is required");
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        final Entity<?> other = (Entity<?>) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
