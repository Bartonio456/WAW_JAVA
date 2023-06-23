package people;

import java.util.Random;

public class Teacher extends Person {
    private final String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void grade(Student student) {
        int grade;
        Random random = new Random();
        if(student.getFavoriteSubject().equals(subject)) {
            // If teacher teaches the favorite subject, the grade is higher (3 to 6).
            grade = random.nextInt(3, 7);
        } else {
            // Grade is from 1 to 4.
            grade = random.nextInt(2, 5);
        }

        student.receiveGrade(grade);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I teach " + subject + ".");
    }
}
