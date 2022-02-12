package spring.common_annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("science")
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi i am a science teacher");

	}

}
