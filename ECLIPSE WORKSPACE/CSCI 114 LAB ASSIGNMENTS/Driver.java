public class Driver {
	
	public static void main(String[] args) {
		
		Student2 Stud1 = new Student2("James", "01/01/2000", "English");
		Student2 Stud2 = new Student2("Jane", "01/20/2000", "Math");
		Student2 Stud3 = new Student2("James", "01/01/2000", "English");
		
		System.out.println(Stud1.equals(Stud2));
		System.out.println(Stud1.equals(Stud3));
		System.out.println(Stud1.toString());
		
		Instructor Instructor1 = new Instructor("Tom", "01/01/2000", 25000);
		Instructor Instructor2 = new Instructor("Larry", "01/20/2000", 20000);
		Instructor Instructor3 = new Instructor("Tom", "01/01/2000", 25000);
		
		System.out.println(Instructor1.equals(Instructor2));
		System.out.println(Instructor1.equals(Instructor3));
		System.out.println(Instructor1.toString());
		
		
	}

}
