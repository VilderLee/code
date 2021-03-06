package com.study.mybatis;

import com.study.mybatis.utils.FlagEnum;

import java.io.Serializable;

/**
 * 功能描述:
 *
 * @package com.study.mybatis
 * @auther vilderlee
 * @date 2019-01-12 17:13
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7273111370871749479L;

    public User() {
    }

    public User(String userId, String userName, FlagEnum flag, String country) {
        this.userId = userId;
        this.userName = userName;
        this.flag = flag;
        this.country = country;
        System.out.println(toString());
    }

    private String userId;
    private String userName;
    private FlagEnum flag;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public FlagEnum getFlag() {
        return flag;
    }

    public void setFlag(FlagEnum flag) {
        this.flag = flag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", flag=" + flag +
                ", country='" + country + '\'' +
                '}';
    }
}
