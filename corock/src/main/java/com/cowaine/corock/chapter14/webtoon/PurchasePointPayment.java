package com.cowaine.corock.chapter14.webtoon;

import java.time.LocalDateTime;

class PurchasePointPayment {

    final CustomerId customerId;                // 구매자의 ID
    final ComicId comicId;                      // 구매할 웹툰의 ID
    final PurchasePoint consumptionPoint;       // 구매에 필요한 포인트
    final LocalDateTime paymentDatetime;        // 구매 일자

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (!customer.isDisabled()) {
            throw new IllegalArgumentException("유효하지 않은 계정입니다.");
        }
        if (!comic.isDisabled()) {
            throw new IllegalArgumentException("현재 구매할 수 없는 만화입니다.");
        }
        if (customer.isShortOfPoint(comic)) {
            throw new RuntimeException("보유하고 있는 포인트가 부족합니다.");
        }

        this.customerId = customer.getId();
        this.comicId = comic.getId();
        this.consumptionPoint = comic.getCurrentPurchasePoint();
        this.paymentDatetime = LocalDateTime.now();
    }

}
