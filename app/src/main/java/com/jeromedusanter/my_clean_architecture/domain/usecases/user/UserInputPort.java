package com.jeromedusanter.my_clean_architecture.domain.usecases.user;

import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserParams;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserParams;

public interface UserInputPort {

    void executeGetUserUseCase(GetUserParams params, UserOutputPort outputPort);

    void executeFetchUserUseCase(FetchUserParams params, UserOutputPort outputPort);
}
