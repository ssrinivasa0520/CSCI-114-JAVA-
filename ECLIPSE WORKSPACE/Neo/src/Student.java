
public class  Student extends Person{
	
	String major;
	
	Student(String name, String DOB, String major){
		
		super(name, DOB);
		this.major = major;
		
	}
	
    public boolean equals(Object o) {
  
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
  
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Student)) {
            return false;
        }
          
        // typecast o to Complex so that we can compare data members 
        Student c = (Student) o;
          
        // Compare the data members and return accordingly 
        return super.equals(c) && this.major.equals(c.major);
    }
	
    public String toString() {
        return super.toString() + String.format(", Major: " + this.major);
    }
}


