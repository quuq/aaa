package com.chatRobot.model;

import java.util.Date;

public class User {

//    private int id;
//    private String email;
//    private String password;
//    private String username;
//    private String role;
//    private int status;
//    private Date regTime;
//    private String regIp;
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public Date getRegTime() {
//        return regTime;
//    }
//
//    public void setRegTime(Date regTime) {
//        this.regTime = regTime;
//    }
//
//    public String getRegIp() {
//        return regIp;
//    }
//
//    public void setRegIp(String regIp) {
//        this.regIp = regIp;
//    }

    private int id;
    private String userName;
    private String age;

    @Override
    public String toString() {
        return "User [id=" + id + ", age=" + age + ", userName=" + userName
                + "]";
    }
    public User(){
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public User(int id, String age, String userName) {
        super();
        this.id = id;
        this.age = age;
        this.userName = userName;
    }
}