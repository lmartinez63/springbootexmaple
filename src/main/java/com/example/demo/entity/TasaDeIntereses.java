package com.example.demo.entity;

import java.math.BigDecimal;

public class TasaDeIntereses {

    private Long id;

    private String interesCode;

    private BigDecimal interesMonto;

    public TasaDeIntereses() {
    }

    public TasaDeIntereses(Long id, String interesCode, BigDecimal interesMonto) {
        this.id = id;
        this.interesCode = interesCode;
        this.interesMonto = interesMonto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInteresCode() {
        return interesCode;
    }

    public void setInteresCode(String interesCode) {
        this.interesCode = interesCode;
    }

    public BigDecimal getInteresMonto() {
        return interesMonto;
    }

    public void setInteresMonto(BigDecimal interesMonto) {
        this.interesMonto = interesMonto;
    }
}
