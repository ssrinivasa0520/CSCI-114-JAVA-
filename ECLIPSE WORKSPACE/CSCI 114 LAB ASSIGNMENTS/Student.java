class Student {
    private String name; //variable for name
    private int totalScore; //variable to hold the Total Score calculated
    private int numScores; //variable to hold the number of scores entered by user

    public Student(String name) {
        this.name = name;
        totalScore = 0;
        numScores = 0;
    }

    public void addQuiz(int score) {
        totalScore += score;
        numScores++;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return totalScore/(double)numScores;
    }
}