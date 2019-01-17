package com.study.mq.rabbitmq.provider;

import java.io.Serializable;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/1/15      Create this file
 * </pre>
 */
public class User implements Serializable {

    private static final long serialVersionUID = 9212752254489938217L;
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", age=" + age + '}';
    }
}