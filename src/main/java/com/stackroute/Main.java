package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String[] args) {

        //Using XmlBeanFactory

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        Movie movie1= (Movie)xmlBeanFactory.getBean("movie1");

        //Using ApplicationContext

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie)applicationContext.getBean("movie2");

        System.out.println(movie1.getActor());
        System.out.println(movie2.getActor());

        //Using BeanDifinitionReader and BeanDefinitionRegistry

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");
        System.out.println(movie3.getActor());

    }
}