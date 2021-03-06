package com.vilderlee.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AnnotatedElement;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/1/10      Create this file
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        Annotation annotation = TestHolder.class.getAnnotation(Test.class);
        System.out.println(annotation.annotationType() == Test.class);

        Annotation annotation1 = TestSubHolder.class.getAnnotation(Test.class);

        System.out.println(annotation == annotation1);

        System.out.println(Component.class.isAnnotationPresent(Inherited.class));

        //AnnotatedElement是Class类的子类。 所以class是不是可以认为跟Class是包装类的关系呢?
        AnnotatedElement element = Object.class;
    }
}
