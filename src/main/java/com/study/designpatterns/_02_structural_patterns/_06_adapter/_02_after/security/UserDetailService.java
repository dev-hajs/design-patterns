package com.study.designpatterns._02_structural_patterns._06_adapter._02_after.security;

public interface UserDetailService {

    UserDetails loadUser(String username);
}
