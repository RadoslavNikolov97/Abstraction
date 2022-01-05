package School;

public class Exam {
    private String exam;
    private double grade;

    public Exam(String exam, double grade) {
        this.exam = exam;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "exam='" + exam + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getExam() {
        return exam;
    }
}
