package org.satvik.razorpay_backend.common.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Money {
    private int amountUnits;
    private String currency;

    public Money(int amountUnits, String currency) {
        this.amountUnits = amountUnits;
        this.currency = currency;
    }

    public Money() {

    }

    public static Money of(int amountUnits, String currency) {
        return new Money(amountUnits, currency);
    }

    public static Money inr(int amountUnits) {
        return new Money(amountUnits, "INR");
    }
    public Money add(Money money) {
        if (this.currency != money.currency) {
            throw new IllegalArgumentException("Cannot add money of different currency");
        }
        return new Money(this.amountUnits + money.amountUnits, this.currency);
    }

    public Money subtract(Money money) {
        if (this.currency != money.currency) {
            throw new IllegalArgumentException("Cannot add money of different currency");
        }
        if (this.amountUnits < money.amountUnits) {
            throw new IllegalArgumentException("Cannot subtract more money than available");
        }
        return new Money(this.amountUnits - money.amountUnits, this.currency);
    }
}
