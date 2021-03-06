package com.study.spring.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/10/18      Create this file
 * </pre>
 */
@Component
@DependsOn("testB")
public class TestA {
    public TestA() {
        System.out.println("初始化A...");
    }
}
