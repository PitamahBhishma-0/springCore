package spring.required_value_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans_required_value_annotation.xml");
		System.out.println("config loaded");
		Student student = context.getBean("student", Student.class);
		student.displayInfo();

	}

}
