package spring.loose_coupling;

public class Student {
  
	Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	    public void cheatingFinal() {
	    	cheat.cheat();
	    }
	
}
