package required_value_annotation;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("The name of student is"+ name);
		System.out.println("The name of Interested course is"+ interestedCourse);
		System.out.println("The hobby is of student"+ hobby);
	}

	public String getInterestedCourse() {
		return interestedCourse;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
