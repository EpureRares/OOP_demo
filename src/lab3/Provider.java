package lab3;

public class Provider {
    private String name;
    private String address;

    public Provider(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Provider() {
        this(null, null);
    }
}
