package finals;

public class Professor extends Person {
	   private String highestEducation;

	   public Professor(String identifier, String name, String id, String hghEdu) {
	       super(identifier, name, id);
	       this.highestEducation = hghEdu;
	       // TODO Auto-generated constructor stub
	   }

	   public String getHighestEducation() {
	       return highestEducation;
	   }

	   public String toString() {
	       return this.getName()+" " + this.highestEducation;
	   }

	}
