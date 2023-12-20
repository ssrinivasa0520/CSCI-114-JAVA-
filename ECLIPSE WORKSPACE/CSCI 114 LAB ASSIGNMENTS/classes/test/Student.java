package classes.test;

import java.util.ArrayList;
import java.util.List;
public class Student extends Person{
	   private List<ClassInfo> classes = null;
	   public Student(String name, String id) {
	       super(name, id);
	       this.classes = new ArrayList<ClassInfo>();
	   }
	   public List<ClassInfo> getClasses() {
	       return classes;
	   }
	   public void addClass(ClassInfo classInfo){
	       this.classes.add(classInfo);
	   }
	   public String toString() {
	       StringBuilder sb = new StringBuilder();
	      
	       sb.append(getName()+ " - "+getId());
	       List<ClassInfo> classes = this.getClasses();
	       if(classes!=null && !classes.isEmpty()){
	           for(ClassInfo c: classes){
	               sb.append("\n");
	               sb.append(c);
	           }
	       }
	      
	       return sb.toString();
	   }
	  
	  

	}