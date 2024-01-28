package com.spring.demo.ConfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	 @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
}
