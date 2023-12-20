package finals;

public class Class {
private String id;
private String profid;
private String name;
public Class(String id, String name, String profid) {
	   super();
	   this.id = id;
	   this.name = name;
	   this.profid = profid;
	}
	public String getId() {
	   return this.id;
	}
	public String getName() {
	   return name;
	}
	public String getProfId() {
		   return this.profid;
		}
	public String toString() {
		return this.id  + " " + this.name; 
	}
}
