package com.study.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.LoginHandler;
import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetailService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
//        UserDetailService userDetailService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(accountService);
        String login = loginHandler.login("jisu", "jisu");
        System.out.println("login = " + login);
    }
}
