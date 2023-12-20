package finals;

public class Person {
	public Person(String identifier, String name, String id) {
	       super();
	       this.Identifier = identifier;
	       this.name = name;
	       this.id = id;
	   }
	   private String Identifier;
	   protected String name;
	   private String id;
	  
	   public String getIdentifier() {
	       return Identifier;
	   }
	   public String getName() {
	       return name;
	   }
	   public String getId() {
	       return id;
	   }
	   public String toString() {
	       return this.getName() + "-" + this.getId();
	   }


	}


