package com.study.spring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/8/27      Create this file
 * </pre>
 */
@Component
public class Test {

    @Autowired private Inject inject;

    public void test(){
        inject.inject();
    }
}
