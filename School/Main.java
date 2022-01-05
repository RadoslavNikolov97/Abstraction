package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Student student;
        String input = sc.nextLine();
        while (!input.equals("end")){
            String studentName = input.split("\\s+")[0];
            int studentAge = Integer.parseInt(input.split("\\s+")[1]);
            student = new Student(studentName,studentAge);
            students.add(student);
            input = sc.nextLine();
        }

        String examInput = sc.nextLine();
        while (!examInput.equals("end")){

            String examName = examInput.split("\\s+")[0];
            double examGrade =  Double.parseDouble(examInput.split("\\s+")[1]);
            Exam exam = new Exam(examName,examGrade);
            students.forEach(stud -> stud.addExam(exam));
            examInput = sc.nextLine();
        }
        String examToBeChanged = sc.nextLine();
        String studExamToBeChanged = sc.nextLine();
        String examName = examToBeChanged.split("\\s+")[0];
        double newGrade = Double.parseDouble(examToBeChanged.split("\\s+")[1]);
        for (Student stud :
                students) {
                stud.getExamAndChangeGrade(examName,newGrade,studExamToBeChanged);

        }
        for (Student stud :
                students) {
            System.out.println(stud);
        }

    }
}
