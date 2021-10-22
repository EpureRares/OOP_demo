package lab2;

public class Course {
    private int ID;

    public Course(int ID) {
        this.ID = ID;
    }

    public void changeGraduationStatus(Student student) {
        student.setGraduate(true);
    }

    public void changeName(String string) {
        string = "POO";
    }
}
