package lab1;

public class Dog {
    private int age = 3;
    public String name;

    /**
     *  Getter prin intermediul acesteia se poate
     *  lua valoarea unui anumit camp al clasei.
     * @return - valoarea campului age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter prin intermediul acestuia se poate
     * modifica valoarea unui anumit camp.
     * @param age - se da o valoare pentru campul age.
     */
    public void setAge(int age) {
        // prin cuvantul cheie this se face referire la obiectul curent.
        this.age = age;
    }

    void bark() {
        System.out.println("Ham ham");
    }
}
