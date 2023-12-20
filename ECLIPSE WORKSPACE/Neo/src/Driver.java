
public class Driver {
	
	public static void main(String[] args) {
		
		Student Student1 = new Student("James", "01/01/2000", "English");
		Student Student2 = new Student("Jane", "01/20/2000", "Math");
		Student Student3 = new Student("James", "01/01/2000", "English");
		
		System.out.println(Student1.equals(Student2));
		System.out.println(Student1.equals(Student3));
		System.out.println(Student1.toString());
		
		Instructor Instructor1 = new Instructor("Tom", "01/01/2000", 25000);
		Instructor Instructor2 = new Instructor("Larry", "01/20/2000", 20000);
		Instructor Instructor3 = new Instructor("Tom", "01/01/2000", 25000);
		
		System.out.println(Instructor1.equals(Instructor2));
		System.out.println(Instructor1.equals(Instructor3));
		System.out.println(Instructor1.toString());
		
		
	}

}
