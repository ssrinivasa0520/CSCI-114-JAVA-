package finals;
import java.io.*;
import java.util.*;

public class StudentReport {

   public static void main(String[] args) throws IOException {
	   try {
	       File roster = new File("FinalRoster.txt");
	       File classList = new File("FinalClassList.txt");
	       File StudentClassList = new File("FinalStudentClassList.txt");
	       FileWriter outputStream = new FileWriter("FinalOutput.txt");
	       ArrayList<Student> students = new ArrayList<Student>();
	       HashMap<String, Class> classMap = new HashMap<>();
	       HashMap<String, Professor> profMap = new HashMap<>();
	       HashMap<String, ArrayList<String>> studclassMap = new HashMap<>();
	       Scanner scanRoster = new Scanner(roster);
	       Scanner scanClassList = new Scanner(classList);
	       Scanner scanStudentClassList = new Scanner(StudentClassList);
	       while (scanRoster.hasNextLine()) {
	           List<String> personDetails = Arrays.asList(scanRoster.nextLine().split(","));
	           if (personDetails.get(0).equals("S")) {
	               students.add(new Student(personDetails.get(0), personDetails.get(1), personDetails.get(2)));
	           }
	           else if(personDetails.get(0).equals("P")) {
	        	   profMap.put(personDetails.get(2), new Professor(personDetails.get(0), String.valueOf(personDetails.get(1)), personDetails.get(2), 
	        			   String.valueOf(personDetails.get(3))));
	           }
	       }
	       while (scanClassList.hasNextLine()) {
	    	   List<String> classDetails = Arrays.asList(scanClassList.nextLine().split(","));
	    	   classMap.put(classDetails.get(0), new Class(classDetails.get(0), classDetails.get(1), classDetails.get(2)));
	       }
	       while (scanStudentClassList.hasNextLine()) {
	    	   List<String> studentClassDetails = Arrays.asList(scanStudentClassList.nextLine().split(","));
	    	   String studentId = studentClassDetails.get(0);
	    	   String classId = studentClassDetails.get(1);
	    	   ArrayList<String> tempList = studclassMap.get(studentId);
	    	   if(tempList == null) {
	    		   tempList = new ArrayList<String>();
	    	   	   tempList.add(classId);
	    		   studclassMap.put(studentId, tempList);
	    	   }
	    	   else {
	    		   if(!tempList.contains(classId)) tempList.add(classId);
	    	   }
	       }
	       ArrayList<Student> notstudents = new ArrayList<Student>();
	       for(Student s: students) {
	    	   System.out.println(s);
	           //Further print details
	           if(studclassMap.containsKey(s.getId())) {
	        	   outputStream.write(s.toString()+"\n");	
		           for(String classId: studclassMap.get(s.getId())) {
				           System.out.println(classMap.get(classId));
				           outputStream.write(classMap.get(classId).toString()+"   ");
				           System.out.println(profMap.get(classMap.get(classId).getProfId()));
				           outputStream.write(profMap.get(classMap.get(classId).getProfId()).toString()+"\n");
		           }
		           outputStream.write("\n");
	           }
	    	   else {
	    		   notstudents.add(s);
	    	   }
	        }
	       outputStream.write("Students with no class assignment\n");
	       for (Student s: notstudents) {
	    	   System.out.println(s);
	    	   outputStream.write(s.toString()+"\n");
	       }
	      
	       outputStream.close();
	      
	   }
	   catch (FileNotFoundException e){
		   e.printStackTrace();
	   }
	   catch (IOException e){
		   e.printStackTrace();
	   }
	}

}
