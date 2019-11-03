package com.itsimon.cloud.entity;

import java.io.Serializable;

/**
 * @author simonMeng
 * @version 1.0
 * @date 2019/11/3
 **/
public class User implements Serializable {
    private String id;
    private String userName;
    private int age;
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
