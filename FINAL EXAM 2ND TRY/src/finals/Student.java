package finals;

import java.io.Serializable;
public class Student extends Person implements Serializable{
	public Student(String identifier, String name, String id) {
	       super(identifier, name, id);
	  
	   }
	   private static final long serialVersionUID = 1L;
	   public String toString() {
	       return super.toString();
	   }

	}

