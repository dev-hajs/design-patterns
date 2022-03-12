package com.study.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetailService;
import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetails;

public class AccountService implements UserDetailService {

    public Account findAccoundByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccoundByUsername(username);
    }
}
