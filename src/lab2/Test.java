package lab2;

public class Test {
    public static void main(String[] args) {
        // Declaratia unui obiect.
        Student st;

        // in momentul de fata st este null, deoarece nu este initializat.
        // System.out.println(st);

        // Constructor default.
        // Prin apelul constructorului se creeaza o instanta a obiectului.
        st = new Student();

        int[] grades = new int[10];

        for (int i = 0;i < grades.length; i++) {
            if (i % 2 == 0) grades[i] = 10;
            else grades[i] = 9;
        }

        // Constructor normal;
        Student st1 = new Student(21, "George", "Computer Science", grades, false);
        Student st2 = new Student(25, "Ana", "Computer Science", grades, true);

        // Copy constructor
        Student st3 = new Student(st1);

        System.out.println(st3.averageGrades());
        System.out.println(st2.averageGrades());
        System.out.println(st1);

        // Referinte in Java.
        Student st4 = st2;
        System.out.println(st4.getAge());
        st4 = st1;
        System.out.println(st4.getAge());
    }
}
