package spring.required_value_annotation;

import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("deprecation")
public class Student {
	// @Value("Gaurav")//------------------- Defining static value
	@Value("${student.name}")// ------------------ defining dynamic value USING .properties file
	private String name;
	// @Value("JAVA")
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	// @Value("Coding")
	@Value("${student.hobby}")
	private String hobby;

	public String getName() {
		return name;
	}

	/*---------------------- USE OF SETTERS TO INJECT -----------------------
	 * @Value("${student.name}") public void setName(String name) { this.name =
	 * name; System.out.println("setName method called");
	 * 
	 * }
	 * 
	 * @Value("${student.interestedCourse}") public void setInterestedCourse(String
	 * interestedCourse) { this.interestedCourse = interestedCourse;
	 * System.out.println("setInterested method called"); }
	 * 
	 * @Value("${student.hobby}") public void setHobby(String hobby) { this.hobby =
	 * hobby; System.out.println("setHobby method called"); }
	 */

	public void displayInfo() {
		System.out.println("The name of student is " + name);
		System.out.println("The name of Interested course is " + interestedCourse);
		System.out.println("The hobby is of student " + hobby);
	}

}
