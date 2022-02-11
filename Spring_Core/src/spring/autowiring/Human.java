package spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart") // HERE I AM EXPLICITLY TELLING SPRING TO MAKE AN OBJECT FOR humanHeart type
	Heart heart;

	public Human() {

	}

	/*
	 * @Autowired
	 * 
	 * @Qualifier("humanHeart") // HERE I AM EXPLICITLY TELLING SPRING TO MAKE AN
	 * OBJECT FOR humanHeart type
	 */	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Human(Heart heart) {
		this.heart = heart;
	}

	public void alive() {

		if (heart != null) {
			heart.pump();
			System.out.println("The animal name is " + heart.getNameOfAnimal() + " the number of heart present is "
					+ heart.getNoOfHeart());
		} else {
			System.out.println("You are dead");
		}
	}

}
