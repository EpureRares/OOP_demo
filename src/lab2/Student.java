package lab2;

import java.util.Arrays;

public class Student {
    private int age;
    private String name;
    private String major;
    private int[] grades;
    private boolean isGraduate;

    /* Default constructor = nu are niciun parametru
     *                      si initializeaza campurile cu valori default.
     * Poate sa lipseasca din implementare.
     * El este apelat automat in momentul in care instantiem un obiect
     */
    public Student() {
        this.age = 0;
        this.name = "";
        this.major = "";
        this.grades = null;
        this.isGraduate = false;
    }

    // Constructorul normal poate avea oricati parametrii.
    public Student(int age, String name, String major, int[] grades, boolean isGraduate) {
        this.age = age;
        this.name = name;
        this.major = major;
        this.grades = grades;
        this.isGraduate = isGraduate;
    }

    //Copy constructor.
    public Student(Student student) {
        /*
         * putem sa apelam campurile din clasa Student, desi sunt private,
         * deoarece ne aflam in clasa Student.
         */
        this.age = student.age;
        this.name = student.name;
        this.major = student.major;
        this.grades = student.grades;
        this.isGraduate = student.isGraduate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    float averageGrades() {
        if (grades == null) {
            return 0;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        return (float) sum / this.grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", isGraduate=" + isGraduate +
                '}';
    }
}
