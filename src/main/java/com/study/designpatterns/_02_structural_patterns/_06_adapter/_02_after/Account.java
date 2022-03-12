package com.study.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Account implements UserDetails {

    private String name;

    private String password;

    private String email;

    public String getName() {
        return name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
