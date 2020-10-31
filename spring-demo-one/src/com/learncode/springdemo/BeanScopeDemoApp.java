package com.learncode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("bean-scope-context.xml");
		
		//retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach);
		
		System.out.println(theCoach1);
		
		context.close();

	}

}
