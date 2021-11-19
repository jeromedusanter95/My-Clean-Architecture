package com.jeromedusanter.my_clean_architecture.app.user;

import com.jeromedusanter.my_clean_architecture.domain.usecases.user.UserInputPort;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.UserOutputPort;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserParams;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserParams;

public class UserController {

    private final UserInputPort userInputPort;
    private final UserOutputPort userOutputPort;

    public UserController(UserInputPort getUserInputPort, UserOutputPort getUserOutputPort) {
        this.userInputPort = getUserInputPort;
        this.userOutputPort = getUserOutputPort;
    }

    public void getUser(int userId) {
        userInputPort.executeGetUserUseCase(new GetUserParams(userId), userOutputPort);
    }

    public void fetchUser(int userId) {
        userInputPort.executeFetchUserUseCase(new FetchUserParams(userId), userOutputPort);
    }
}
