package spring.dependency_injection_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student student0=new Student(); Another_Student st =new Another_Student();
		 * MathCheat math =new MathCheat(); student0.setMathCheat(math);// SETTER
		 * INJECTION USING SETMETHOD st.setMathCheat(math); st.cheating1();
		 * student0.cheating();
		 */ ApplicationContext context = new ClassPathXmlApplicationContext("beans_DI_Object_Injection.xml");
		System.out.println("config loaded");
		Student student = context.getBean("student", Student.class);
		student.cheating();
		Another_Student student1 = context.getBean("another_student", Another_Student.class);
		student1.cheating1();

	}

}
