package com.cowaine.snoopingh.chap12;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. 반드시 현재 클래스의 인스턴스 변수 사용하기
         *
         * 2. 불변을 활용해서 예상할 수 있는 메서드 만들기
         *
         * 3. 묻지 말고 명령하기
         *      - getter/setter : 다른 클래스를 확인하고 조작하는 메서드 구조가 되기 쉬움.
         *                        일반적으로 개발 생산성이 좋지 않은 소프트웨어 소스 코드에서 자주 볼 수 있음.
         *                        자신의 상태를 안전하게 만드는 로직이 전혀 없다.
         *
         * 4. 커맨드/쿼리 분리 (커맨드: 상태 변경, 쿼리: 상태 리턴, 모디파이어: 동시에)
         *      - CQS  : 단순히 함수의 역할을 명확히 구분하는데 중점을 둠
         *      - CQRS : 시스템 전체의 읽기와 쓰기 작업을 분리하여 복잡한 요구 사항을 더 효율적으로 처리하는데 중점을 둠
         *
         * 5. 매개변수
         *      - 불변 매개변수로 만들기.
         *      - 플래그 매개변수 사용하지 않기
         *      - null 전달하지 않기 (null 에 의미부여 하지 않기, Equipment.EMPTY)
         *      - 출력 매개변수 사용하지 않기
         *      - 매개변수는 최대한 적게 사용하기
         *
         * 6. 리턴 값
         *      - 자료형을 사용해서 리턴 값의 의도 나타내기 (Price)
         *      - null 리턴하지 않기
         *      - 오류는 리턴 값으로 리턴하지 말고 예외 발생시키기
         *
         *
         *
         * 7. static 메서드와 관련된 주의 사항
         *      static 메서드는 같은 클래스에 정의된 인스턴스 변수를 조작할 수 없음.
         *      데이터와 데이터를 조작하는 로직이 분산되어, 응집도가 낮은 구조를 만들 수 있음.
         *      팩토리 메서드, 횡단 관심사 등 응집도가 낮을 때 생기는 문제를 걱정할 필요가 없는 상황에서만 사용.
         */
    }
}