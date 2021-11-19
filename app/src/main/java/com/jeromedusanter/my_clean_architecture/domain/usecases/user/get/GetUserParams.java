package com.jeromedusanter.my_clean_architecture.domain.usecases.user.get;

public class GetUserParams {

    private int userId;

    public GetUserParams(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
