package com.cowaine.corock.chapter08.rpg.objects;

/**
 * 멤버들의 호감도
 * subject 가 target 에게 가지는 호감도를 확인하거나, 증가/감소시킵니다.
 * subjectId 와 targetId 는 subject, target 과 관련 있는 멤버의 ID 를 나타냅니다.
 * <p>
 * 접근 수식자를 생략하면 package private 으로 설정됨.
 * 패키지 내부에서만 접근 가능함.
 */
class PositiveFeelings {

    /**
     * @param subjectId 호감도를 확인하고 싶은 멤버의 ID
     * @param targetId  호감 대상 멤버 ID
     * @return 호감도
     */
    int value(int subjectId, int targetId) {
        return 0;
    }

    /**
     * 호감도 증가시키기
     *
     * @param subjectId 호감도를 증가시키고자 하는 멤버 ID
     * @param targetId  호감 대상 멤버 ID
     */
    void increase(int subjectId, int targetId) {
        // (...)
    }

    /**
     * 호감도 감소시키기
     *
     * @param subjectId 호감도를 감소시키고자 하는 멤버 ID
     * @param targetId  호감 대상 멤버 ID
     */
    void decrease(int subjectId, int targetId) {
        // (...)
    }

}
