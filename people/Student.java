package people;

import java.util.ArrayList;

public class Student extends Person {
    private final String favoriteSubject;
    private final ArrayList<Integer> grades;

    public Student(String name, int age, String favoriteSubject) {
        super(name, age);
        this.favoriteSubject = favoriteSubject;
        this.grades = new ArrayList<>();
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public ArrayList<Integer> getGrades() {
        // Copy list of grades to prevent modifying it.
        return new ArrayList<Integer>(grades);
    }

    public void receiveGrade(int grade) {
        this.grades.add(grade);
    }

    public int getFinalGrade() {
        if(grades.size() == 0) {
            // If student has no grades, the final grade is 1.
            return 1;
        }

        int sum = 0;
        for(var grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My favorite subject is " + favoriteSubject + ".");
    }
}
