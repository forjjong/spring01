package com.forjjong.biz.user;

import java.util.Date;

public class UserVO {
    private int userIdx;
    private String userId;
    private String password;
    private String name;
    private Date regDate;
    private Date updateDate;

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void init_user() { userIdx = 0; userId = ""; password = ""; name = ""; }

    @Override
    public String toString() {
        return "UserVO [userIdx=" + userIdx +  ", userId=" + userId + ", password=" + password
                + ", name=" + name + ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
    }
}
