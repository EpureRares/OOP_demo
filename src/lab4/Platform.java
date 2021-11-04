package lab4;

import java.util.ArrayList;
import java.util.List;

public class Platform {
    private static Platform platform = null;
    private final List<Account> accounts;
    private final List<Account> waitList;

    private Platform() {
        this.accounts = new ArrayList<>();
        this.waitList = new ArrayList<>();
    }

    public static Platform getInstance() {
        if (platform == null) {
            platform = new Platform();
        }
        return platform;
    }

    public Account createAccount(String username, String password) {
        if (accounts.size() == Constraints.MAXIMUM_SUPPORTED_USERS) {
            Account waitAccount = new Account(username, password);
            this.waitList.add(waitAccount);
            return waitAccount;
        }

        Account account = new Account(username, password);
        this.accounts.add(account);
        return account;
    }

    public Account changePassword (String username, String password) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                account.changePassword(username, password);
                return account;
            }
        }

        return null;
    }

    public List<Account> getWaitList() {
        return waitList;
    }
}
