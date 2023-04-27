package com.pack.beanannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     ApplicationContext a= new AnnotationConfigApplicationContext(Configration.class);
     Resort r = (Resort) a.getBean(Resort.class);
     r.display();
    }
}
