import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentReport {

   public static void main(String[] args) throws IOException {
       File roster = new File("FinalRoster.txt");
       File classList = new File("FinalClassList.txt");
       File studentClassList = new File("FinalStudentClassList.txt");
       FileOutputStream outputStream = new FileOutputStream("FinalOutput.txt");
       ObjectOutputStream outputWriter=new ObjectOutputStream(outputStream);
       List<Student> students = new ArrayList<>();

       Scanner scanRoster = new Scanner(roster);
       while (scanRoster.hasNextLine()) {
           List<String> personDetails = Arrays.asList(scanRoster.nextLine().split(","));
           if (personDetails.get(0).equals("S")) {
               students.add(new Student(String.valueOf(personDetails.get(0)), String.valueOf(personDetails.get(1)), Integer.parseInt(personDetails.get(2))));
           }
       }
      
       //Print lIST of students
       for(Student s:students) {
           System.out.println(s);
           //Further print details
           outputWriter.writeObject(s.toString()+"\n");
          
          
       }
       outputWriter.close();
      
   }

}