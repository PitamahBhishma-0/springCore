package spring.common_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	String name;
	@Autowired
	private Principel principel;
	@Autowired
	@Qualifier("science")
	private Teacher teacher;
	
	@Required
	@Value("${College.name}")
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public College(Principel principel) { this.principel=principel; }
	 */
	/*
	 * public void setMathTeacher(Teacher mathTeacher) { 
	 * this.mathTeacher = mathTeacher; 
	 *                  }
	 */
	/*
	 * public void setPrincipel(Principel principel) { 
	 * this.principel = principel;
	 *   }
	 */
	

	public void test() {
		System.out.println("College name is"+name);
		System.out.println("Test method called");
		principel.greeting();
		teacher.teach();
	}
   





	
}
