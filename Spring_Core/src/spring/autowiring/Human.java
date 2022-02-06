package spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	Heart heart;
	
	public Human() {
		
	}
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public Human(Heart heart) {
		this.heart=heart;
	}

	public void alive() {

		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("You are dead");
		}
	}

}
