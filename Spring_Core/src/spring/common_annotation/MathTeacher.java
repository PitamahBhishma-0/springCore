package spring.common_annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi I am a math teacher");

	}

}
