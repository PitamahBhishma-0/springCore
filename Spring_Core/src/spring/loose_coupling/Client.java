package spring.loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("beans_spring_looseCoupling.xml"); 
	Student student1=context.getBean("student",Student.class);
     student1.cheatingFinal();

	}

}
