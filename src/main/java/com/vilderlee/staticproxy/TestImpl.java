package com.vilderlee.staticproxy;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/7/24      Create this file
 * </pre>
 */
public class TestImpl implements Test{
    @Override
    public void test() {
        System.out.println(TestImpl.class.getName());
    }
}
