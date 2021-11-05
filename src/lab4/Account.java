package lab4;

/***
 * in momentul in care adaug cuvantul cheie final
 * in momentul in care definesc o clasa, atunci
 * nu o sa pot crea clase derivate din clasa curenta
 */
public /*final*/ class Account {
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


    /**
     * in momentul in care adaug cuvantul cheie final unei metode,
     * inseamna ca nu pot suprascrie metoda intr-o clasa derivata
     * */
    public /*final*/ void operations() {
        System.out.println("Basic operations.");
    }

    public static void printMessage() {
        System.out.println("Hello World!");
    }
}

class UserAccount extends Account{

    public UserAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public void operations() {
        System.out.println("Normal user.");
    }
}

class AdminAccount extends Account {

    public AdminAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public void operations() {
        System.out.println("Privileged user.");
    }
}
