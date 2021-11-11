package lab4;

public class Test {
    // Ce se intampla in cazul in care se elimina cuvantul cheie static?
    static int x = 0;
    static {
        x = 1;
        System.out.println(x);
    }

    public static void main(String[] args) {
        String password = "aaaa";
        String newPassword = "aaaa";
        String password1 = password;

        if (newPassword == password) {
            System.out.println("Se compara referintele.");
        }
        password += "aaaa";

        if (password1 == password) {
            System.out.println("Nu sunt egale referintele");
        }

        Platform platform = Platform.getInstance();
        platform.createAccount("Gogu1", password);
        platform.createAccount("Gogu2", password1);

        platform.changePassword("Gogu1", (newPassword + "as"));

        Account account = null;
        account.printMessage();
    }
}
