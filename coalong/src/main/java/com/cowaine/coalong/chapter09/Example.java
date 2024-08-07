package com.cowaine.coalong.chapter09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Example {
    // 레이블 문자열, 표시 색(RGB), 최대 문자 수
    String title = "타이틀, 255, 250, 240, 64";

    void show9dot17() throws IllegalAccessException, NoSuchFieldException {
        Level level = Level.initialize();
        System.out.println("Level : " + level.value);

        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);

        System.out.println("Level : " + level.value);
    }

    void show9dot20() throws Exception {
        Employer user = (Employer) generateInstance("customer", "User");
    }

    static Object generateInstance(String packageName, String className) throws Exception {
        String fillName = packageName + "." + className;
        Class klass = Class.forName(fillName);
        Constructor constructor = klass.getDeclaredConstructor();
        return constructor.newInstance();
    }

}
