import java.io.Serializable;
public class Student3 extends Person2 implements Serializable{
	public Student3(String identifier, String name, int id) {
	       super(identifier, name, id);
	  
	   }
	   private static final long serialVersionUID = 1L;
	   public String toString() {
	       return "" + getName() + " - " + getId() + "";
	   }

	}
