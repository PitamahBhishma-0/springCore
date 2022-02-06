package spring.autowiring;

public class Human {
	Heart heart;

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
