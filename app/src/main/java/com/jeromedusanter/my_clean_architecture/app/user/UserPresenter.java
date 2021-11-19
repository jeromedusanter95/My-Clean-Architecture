package com.jeromedusanter.my_clean_architecture.app.user;

import com.jeromedusanter.my_clean_architecture.app.ErrorMapper;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.UserOutputPort;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserResponse;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserResponse;

public class UserPresenter implements UserOutputPort {

    private final UserView userView;
    private final ErrorMapper errorMapper;

    public UserPresenter(UserView userView, ErrorMapper errorMapper) {
        this.userView = userView;
        this.errorMapper = errorMapper;
    }

    @Override
    public void onGetUserSucceeded(GetUserResponse.Success response) {
        userView.renderSuccess(new UserViewModel(response.getUser().getName()));
    }

    @Override
    public void onGetUserFailed(GetUserResponse.Error error) {
        userView.renderError(errorMapper.mapDataToDomainException(error.getException()));
    }

    @Override
    public void onFetchUserSucceeded(FetchUserResponse.Success response) {
        userView.renderSuccess(new UserViewModel(response.getUser().getName()));
    }

    @Override
    public void onFetchUserFailed(FetchUserResponse.Error error) {
        userView.renderError(errorMapper.mapDataToDomainException(error.getException()));
    }
}
