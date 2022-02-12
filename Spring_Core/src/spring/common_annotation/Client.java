package spring.common_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*  IOC USING INTERFACE
		 *  ApplicationContext context = new AnnotationConfigApplicationContext(Collegeconfig.class);
		 */
		//IOC using classs
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Collegeconfig.class);
		College college= context.getBean("colBean",College.class);
		
		System.out.println(college+" is the object formed");
        college.test();
        context.close();
	}

}
