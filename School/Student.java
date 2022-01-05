package School;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private List<Exam> examsPassed;


    public Student(String name, int age) {
        super(name, age);
        this.examsPassed = new ArrayList<>();
    }

    public void addExam(Exam exam) {
        examsPassed.add(exam);
    }

    public void getExamAndChangeGrade(String examName, double newGrade, String studExamToBeChanged) {
        if (super.getName().equals(studExamToBeChanged)) {
            Exam newExamGrade = new Exam(examName,newGrade);
           examsPassed.removeIf(exam -> exam.getExam().equals(examName));
           examsPassed.add(newExamGrade);
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "examsPassed=" + examsPassed +
                '}';
    }
}
