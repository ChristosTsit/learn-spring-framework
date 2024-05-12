package com.in28minutes.learnspringframework.hellowworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1:Launch a Spring Context(application)
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			//2:Configure the things that we want Spring to manage
			//HelloWorldConfiguration-Configuration
			//name - @Bean
			
			
			//3: Retrieving Beans managed by Sprin
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person4Parameters"));
			System.out.println(context.getBean("person5Qualifier"));
			
			String[] beanNames = context.getBeanDefinitionNames();
			
			for(int i=0;i<beanNames.length;i++) {
				System.out.println(beanNames[i]);
			}
		}	
	}
}
