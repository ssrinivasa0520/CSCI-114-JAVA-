class StudentTester {

    public static void main(String[] args) {
        Student student = new Student("Shreyas");
        student.addQuiz(80);
        student.addQuiz(50);
        student.addQuiz(80);
        System.out.println("Name: " + student.getName());
        System.out.println("Total score is " + student.getTotalScore());
        System.out.println("Average score is " + student.getAverageScore());
    }
}
