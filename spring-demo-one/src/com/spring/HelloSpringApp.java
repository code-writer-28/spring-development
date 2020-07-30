package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		// creating a spring container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = applicationContext.getBean("cricketCoach", Coach.class);

		// call methods from the bean
		System.out.println(coach.getDailyWorkOut());

		// close the context
		applicationContext.close();

	}

}

/**
 * FAQ: Why do we specify the Coach interface in getBean()?
 * 
 * Question
 * 
 * Why do we specify the Coach interface in getBean()?
 * 
 * For example:
 * 
 * Coach theCoach = context.getBean("myCoach", Coach.class);
 * 
 * ---
 * 
 * Answer
 * 
 * When we pass the interface to the method, behind the scenes Spring will cast
 * the object for you.
 * 
 * context.getBean("myCoach", Coach.class)
 * 
 * However, there are some slight differences than normal casting.
 * 
 * From the Spring docs:
 * 
 * Behaves the same as getBean(String), but provides a measure of type safety by
 * throwing a BeanNotOfRequiredTypeException if the bean is not of the required
 * type. This means that ClassCastException can't be thrown on casting the
 * result correctly, as can happen with getBean(String).
 * 
 */
