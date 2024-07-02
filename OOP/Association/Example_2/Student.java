package Association.Example_2;

public class Student {
    private String name;
    private University university; // Bidirectional association

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }
}
