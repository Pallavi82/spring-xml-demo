package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Actor implements BeanNameAware, BeanFactoryAware {

    private String name;
    private  String gender;
    private  int age;

    public Actor() {

    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" + "name= " + name + '\'' + ", gender= " + gender + '\'' + ", age= " + age + '}';
    }

    public void setBeanName(String s) {
        System.out.println("BeanNameAware " +s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In BeanFactoryAware " +beanFactory);
    }
}
