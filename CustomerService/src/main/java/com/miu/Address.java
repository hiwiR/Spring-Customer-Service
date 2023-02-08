package com.miu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private Long Id;
    private int zipCode;

    public Address() {
    }

    public Address(Long id, int zipCode) {
        Id = id;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
