package com.spring.demo.ConfigExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context
         = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

 HelloWorld p = context.getBean(HelloWorld.class);
 p.setMessage("hai");

 System.out.println(p.getMessage());
    }
}
