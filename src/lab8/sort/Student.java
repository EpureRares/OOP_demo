package lab8.sort;

public class Student {
    private final String name;
    private final int ID;

    public Student(String name, int id) {
        this.name = name;
        ID = id;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
