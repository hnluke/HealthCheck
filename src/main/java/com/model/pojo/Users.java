package com.model.pojo;

import java.io.Serializable;

public class Users implements Serializable {
    public final static long serialVersionUID = 100L;
    private Integer userIid;
    private String userName;
    private String userPwd;
    private String userPrio;
    private String userTele;
    private Boolean userLock;

    public Users() {}

    public Integer getUserIid() {
        return userIid;
    }

    public void setUserIid(Integer userIid) {
        this.userIid = userIid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPrio() {
        return userPrio;
    }

    public void setUserPrio(String userPrio) {
        this.userPrio = userPrio;
    }

    public String getUserTele() {
        return userTele;
    }

    public void setUserTele(String userTele) {
        this.userTele = userTele;
    }

    public Boolean getUserLock() {
        return userLock;
    }

    public void setUserLock(Boolean userLock) {
        this.userLock = userLock;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userIid=" + userIid +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPrio='" + userPrio + '\'' +
                ", userTele='" + userTele + '\'' +
                ", userLock=" + userLock +
                '}';
    }
}
