public class  Instructor extends Person{
	
	float salary;
	
	Instructor(String name, String DOB, float salary){
		
		super(name, DOB);
		this.salary = salary;
		
	}
	
    public boolean equals(Object o) {
  
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
  
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Instructor)) {
            return false;
        }
          
        // typecast o to Complex so that we can compare data members 
        Instructor c = (Instructor) o;
          
        // Compare the data members and return accordingly 
        return super.equals(c) && this.salary == c.salary;
    }
	
    public String toString() {
        return super.toString() + String.format(" ,Salary: " + this.salary);
    }
}