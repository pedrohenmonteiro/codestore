package com.pedromonteiro.codestore.shared.domain.entity;

import com.pedromonteiro.codestore.shared.domain.valueobject.Identifier;

public class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    public AggregateRoot(final ID id) {
        super(id);
    }
    
}
