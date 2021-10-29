package lab4;

public class Account {
    private final String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void changePassword(String username, String new_password) {
        if (this.username.equals(username)) {
            this.password = new_password;
            return;
        }

        System.out.println("Username does not exist!");
    }

    public String getUsername() {
        return username;
    }
}
