package com.hxt.entity;

import java.io.Serializable;

/**
 * Created by Huangxiutao on 2017/7/19.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 96300068506047160L;
    private Long id;
    private String nickName;
    private String gender;

    public User() {
    }

    public User(Long id, String nickName, String gender) {
        this.id = id;
        this.nickName = nickName;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
