package com.jeromedusanter.my_clean_architecture.data.user;

public class UserData {

    private final int id;
    private final String name;

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
