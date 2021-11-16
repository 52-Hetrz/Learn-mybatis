package com.example.mybatis.dao;

/**
 * @ClassName UserDao
 * @Description
 * @Author Life
 * @Date 2021/11/16 12:08
 * @Version 1.0
 */


public class UserDao {

    private Integer id;
    private String name;
    private String password;
    private String mail;
    private String image;

    public UserDao(){}

    public UserDao(String name, String password, String mail, String image){
        this.setName(name);
        this.setImage(image);
        this.setPassword(password);
        this.setMail(mail);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
