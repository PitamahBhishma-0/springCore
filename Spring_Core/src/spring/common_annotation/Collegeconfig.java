package spring.common_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.common_annotation")//----- NOT NEEDED IF WE ARE USING BEAN-CONFIG annotation
@PropertySource("classpath:spring-common-annotattion-college-info.properties")
public class Collegeconfig {
/*	------  without using component-scan we are setting beans here -----------
	// DI THROUGH INTERFACE
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principel principelbean() {
		return new Principel();
	}
	*/
	
	// BEAN FOR THE COLLEGE AS IT IS RETURNING TYPE COLLEGE
	// THE PARAMETER DEFINED INSIDE THE BEAN ANNOTATION OVERRIDES THE METHOD NAME FOR BEAN AND WE CAN DEFINE MULTIPLE BEANS
	@Bean(name = {"collegeBeans","colBean"})
	public College collegeBean() {
		 College college=new College();
		 
		 /* USING CONSTRUCTOR INJECTION 
		return new College(principelbean());--since college wants the principel oject injected we did so
		 */ 
		 
		//college.setPrincipel(principelbean());  ------------- Setter injection
		//college.setMathTeacher(mathTeacherBean()); ------------- Setter injection
		return college;
		
	
	
	}
}

