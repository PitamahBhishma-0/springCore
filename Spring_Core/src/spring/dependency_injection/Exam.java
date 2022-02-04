package spring.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
/*	-------------------------------HARD CODING---------------------------------------------------------------	
		Student student=new Student()
	// Student "String name" has been injected here without encapsulation(bad approach)		
	//	student.studentName="Gaurav";
	//USING Of SETTER VALUES TO INJECT THE DEPENDENCY	
		student.setstudentName("Gaurav");
		student.studentInfo();
--------------------------------------------------------------------------------------------------		
   //    ============= USING PLAIN CONSTRUCTOR INJECTION HARDCODING ===============		
		Student student =new Student(2222,"SAURAV");
		student.studentInfo();
------------------------------------------------------------------------------------------------		
*/
		
//             USE OF SPRING STRING DEPENDENCY INJECTION
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_DI.xml");
// GIVES ME THE OBJECT OF STUDENT CLASS USING IOC		
//	    Student student=context.getBean("student",Student.class);
//		student.studentInfo();
		
		Student saurav=context.getBean("saurav",Student.class);
		saurav.studentInfo();
		
		Student gaurav =context.getBean("gaurav",Student.class);
        gaurav.studentInfo();
	}

}
