package com.cowaine.corock.chapter03;

import lombok.Getter;

import java.util.Currency;

@Getter
public class Money {

    private final int amount;
    private final Currency currency;

    public Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정해 주세요.");
        }

        if (currency == null) {
            throw new NullPointerException("통화 단위를 지정해 주세요.");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 다릅니다.");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }

    // 금액을 곱하는 일은 일반적인 회계 서비스에서 있을 수 없음
    // public Money multiply(final Money other) {
    //     if (!currency.equals(other.currency)) {
    //         throw new IllegalArgumentException("통화 단위가 다릅니다.");
    //     }
    //
    //     final int multiplied = amount * other.amount;
    //
    //     return new Money(multiplied, currency);
    // }

}
