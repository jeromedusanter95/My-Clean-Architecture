package com.jeromedusanter.my_clean_architecture.domain.usecases.user;

import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserResponse;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserResponse;

public interface UserOutputPort {

    void onGetUserSucceeded(GetUserResponse.Success response);

    void onGetUserFailed(GetUserResponse.Error error);

    void onFetchUserSucceeded(FetchUserResponse.Success response);

    void onFetchUserFailed(FetchUserResponse.Error error);
}
