package com.qianfeng.mybatis.dto;

/**
 * Created by admin on 2018/3/19.
 */
public class UsersDto {

      private Integer usersId;
      private String usersName;
      private String usersEmail;
      private String usersPwd;
     private String usersSale;

    public String getUsersSale() {
        return usersSale;
    }

    public void setUsersSale(String usersSale) {
        this.usersSale = usersSale;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getUsersPwd() {
        return usersPwd;
    }

    public void setUsersPwd(String usersPwd) {
        this.usersPwd = usersPwd;
    }
}
