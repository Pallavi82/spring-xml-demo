package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String[] args) {

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        Movie movie1= (Movie)xmlBeanFactory.getBean("movie1");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie)applicationContext.getBean("movie2");


        System.out.println(movie1.getActor());
        System.out.println(movie2.getActor());

        //BeanDefinitionRegistry beanDefinitionRegistry= new BeanDefinitionReader("beans.xml");

    }
}