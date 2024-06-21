package com.cowaine.sunset0.chapter5;

import java.math.BigDecimal;


//범용 처리 클래스
public class Common {

    //세금 포함 금액 계산하기
    static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {
        return amountExcludingTax.multiply(taxRate);
    }

    //사용자가 이미 탈퇴했다면 true
    static boolean hasResigned(User user) {
        return true;
    }


    //상품 주문하기
    static void createOrder(Product product) {
    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        return true;
    }

    public static class Product {
    }

    public static class User {
    }
}
