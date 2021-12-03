package lab8.sort;

public class Car implements Comparable<Car> {
    private final int year;
    private final int price;

    public Car(int year, int price) {
        this.year = year;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        if (this.year - o.year != 0) {
            return this.year - o.year;
        }

        return this.price - o.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                '}';
    }
}
