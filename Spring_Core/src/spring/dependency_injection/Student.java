package spring.dependency_injection;

public class Student {
	   private int id;
       private String studentName;
       
       /*
        * ================ SETTER METHOD FOR DEPENDENCY INJECTION ==================
        * 
       public void setid(int id) {
    	   this.id=id;
    	   System.out.println("SETTER METHOD CALLED :"+"SETID");
       }
       public void setstudentName(String name) {
    	   this.studentName=name;
    	   System.out.println("SETTER METHOD CALLED :"+"SETNAME");
       }
       */
 //==================  CONSTRUCTOR INJECTION FOR DEPENDENCY INJECTION ====================      
       public Student(int id) {
    	   this.id=id;
       }
       
       public Student(int id,String studentName) {
    	   this.id=id;
    	   this.studentName=studentName;
       }
       void studentInfo() {
    	   System.out.println("The student name is :"+studentName+" and id is "+id); 
       }
      
       
       
}
