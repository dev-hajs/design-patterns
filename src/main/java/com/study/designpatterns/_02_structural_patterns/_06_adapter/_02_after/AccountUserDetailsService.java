package com.study.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetailService;
import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetails;

public class AccountUserDetailsService implements UserDetailService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccoundByUsername(username);
        return new AccountUserDetails(account);
    }
}
