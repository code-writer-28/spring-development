package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = applicationContext.getBean("myCoach", Coach.class);

		// call methods from the bean
		System.out.println(coach.getDailyWorkOut());

		// close the context
		applicationContext.close();

	}

}
