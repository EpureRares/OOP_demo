package lab11;

import javax.xml.catalog.Catalog;
import java.util.List;

public class Student {
    private final String name;
    private final double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public <O> void printSomeInfo(List<O> data) {
        data.forEach(x -> System.out.println("Grade: " + x));
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
