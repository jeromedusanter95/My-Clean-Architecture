package com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch;

public class FetchUserParams {

    private int userId;

    public FetchUserParams(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
