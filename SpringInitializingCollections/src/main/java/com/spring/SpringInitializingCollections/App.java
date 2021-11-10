package com.spring.SpringInitializingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Triangle triangle = (Triangle)context.getBean("triangle");
    	triangle.draw();
    }
}
