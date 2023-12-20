public class Person2 {
	public Person2(String identifier, String name, int id) {
	       super();
	       Identifier = identifier;
	       this.name = name;
	       this.id = id;
	   }
	   private String Identifier;
	   private String name;
	   private int id;
	  
	   public String getIdentifier() {
	       return Identifier;
	   }
	   public String getName() {
	       return name;
	   }
	   public int getId() {
	       return id;
	   }
	   public String toString() {
	       return "Person [Identifier=" + Identifier + ", name=" + name + ", id=" + id + "]";
	   }


	}

