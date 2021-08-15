package com.lyq.bootdemos.demo05.domain;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 0:32
 */
public class User {

    private String name;
    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
