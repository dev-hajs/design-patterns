package com.study.designpatterns._02_structural_patterns._06_adapter._01_before.security;

public class LoginHandler {

    UserDetailService userDetailService;

    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
