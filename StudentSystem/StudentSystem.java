package StudentSystem;


import java.util.HashMap;
import java.util.Map;


public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] args) {

        if (args[0].equals("Create")) {

            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            if (!repo.containsKey(name)) {

                Student student = new Student(name, age, grade);

                repo.put(name, student);
            }
        } else if (args[0].equals("Show")) {

            String name = args[1];

            if (repo.containsKey(name)) {

                Student student = repo.get(name);

                String output = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    output += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    output += " Average student.";
                } else {
                    output += " Very nice person.";
                }

                System.out.println(output);
            }
        }
    }
}
