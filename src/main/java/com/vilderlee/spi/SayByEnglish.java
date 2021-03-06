package com.vilderlee.spi;

import com.alibaba.dubbo.common.URL;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/1/10      Create this file
 * </pre>
 */
public class SayByEnglish implements Say{
    @Override public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override public void export(URL url) {
        System.out.println("english");
    }
}
