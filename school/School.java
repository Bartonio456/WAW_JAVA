package school;

import people.Student;
import people.Teacher;

import java.util.ArrayList;

public class School {
    private final ArrayList<Teacher> teachers;
    private final ArrayList<Student> students;

    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void gradeStudents() {
        for (Teacher teacher : teachers) {
            for (Student student : students) {
                teacher.grade(student);
                System.out.println(teacher.getName() + " graded " + student.getName() + " with a grade of " + student.getGrades().get(student.getGrades().size() - 1));
            }
        }
    }
}
