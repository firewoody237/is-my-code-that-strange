package com.cowaine.corock.chapter05.point;

import lombok.ToString;

@ToString
public class GiftPoint {

    private static final int MIN_POINT = 0;

    final int value;

    public GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트를 0 이상 입력해야 합니다.");
        }

        value = point;
    }

    /**
     * 포인트를 추가한다.
     *
     * @param other 추가 포인트
     * @return 추가 후 남은 포인트
     */
    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

    /**
     * 남은 포인트가 충분한지 검증한다.
     *
     * @param point 소비 포인트
     * @return 남은 포인트가 소비 포인트 이상이라면 true
     */
    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    /**
     * 포인트를 소비한다.
     *
     * @param point 소비 포인트
     * @return 소비 후 남은 포인트
     */
    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("포인트가 부족합니다.");
        }

        return new GiftPoint(value - point.value);
    }

}
