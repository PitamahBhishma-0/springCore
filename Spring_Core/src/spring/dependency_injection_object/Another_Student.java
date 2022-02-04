package spring.dependency_injection_object;

public class Another_Student {
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void cheating1() {
		cheat.mathCheat();
	}
}
