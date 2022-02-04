package spring.dependency_injection_object;

public class Student {
   MathCheat mathCheat;
   
    public void setMathCheat(MathCheat mathCheat) {
    	this.mathCheat=mathCheat;
    }
   
   void cheating() {
	   mathCheat.mathCheat();
   }
}
