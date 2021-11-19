package com.jeromedusanter.my_clean_architecture.app.user;

public class UserViewModel {

    private final String name;

    public UserViewModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
