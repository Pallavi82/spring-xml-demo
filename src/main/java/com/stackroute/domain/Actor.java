package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor
{

    private String name;
    private int age;
    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
    public Actor(){}

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}