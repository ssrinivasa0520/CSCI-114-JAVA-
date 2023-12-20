
public class Person {
	
	String name;
	String DOB;
	
	Person(String name, String DOB){
		
		this.name = name;
		this.DOB = DOB;
		
	}
	
    public boolean equals(Object o) {
  
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
  
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Person)) {
            return false;
        }
          
        // typecast o to Complex so that we can compare data members 
        Person c = (Person) o;
          
        // Compare the data members and return accordingly 
        return this.name.equals(c.name) && this.DOB.equals(c.DOB);
    }
	
    public String toString() {
        return String.format("Name " + this.name + ", DOB: "+this.DOB);
    }
}


