package com.jeromedusanter.my_clean_architecture.app.user;

import com.jeromedusanter.my_clean_architecture.app.AppException;

interface UserView {

    void renderSuccess(UserViewModel viewModel);

    void renderError(AppException exception);
}
