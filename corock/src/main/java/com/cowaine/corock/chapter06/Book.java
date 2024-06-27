package com.cowaine.corock.chapter06;

import com.cowaine.corock.chapter06.domain.Circle;
import com.cowaine.corock.chapter06.domain.Rectangle;
import com.cowaine.corock.chapter06.domain.Shape;
import com.cowaine.corock.chapter06.game.HealthCondition;
import com.cowaine.corock.chapter06.game.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp92To93();
        // Book.pp101To103();
        // Book.pp103To104();
    }

    private static void pp92To93() {
        HealthCondition healthCondition = HealthCondition.from(new Member(20, 100, 0, 10, 1, 4, 4, 4));
        log.info("Member's health condition: {}", healthCondition);
    }

    private static void pp101To103() {
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        Circle circle = new Circle(0.2);

        log.info("The area of a rectangle: {}, the area of a circle: {}", rectangle.area(), circle.area());

        // 다른 자료형의 인스턴스는 할당할 수 없습니다. 컴파일 오류가 발생합니다.
        // 또한 같은 이름의 메서드라도 사용할 수 없습니다.
        // Rectangle rectangle = new Circle(8);
        // rectangle.area();

        Book.showArea(new Rectangle(8, 12));
    }

    private static void showArea(Object shape) {
        if (shape instanceof Rectangle) {
            log.info("The area of a rectangle: {}", ((Rectangle) shape).area());
        }

        if (shape instanceof Circle) {
            log.info("The area of a circle: {}", ((Circle) shape).area());
        }
    }

    private static void pp103To104() {
        Shape shape = new Circle(10.0);
        log.info("The area of a shape: {}", shape.area());

        shape = new Rectangle(20.0, 25.0);
        log.info("The area of a shape: {}", shape.area());
    }

}
