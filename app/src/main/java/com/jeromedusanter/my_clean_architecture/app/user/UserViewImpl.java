package com.jeromedusanter.my_clean_architecture.app.user;

import com.jeromedusanter.my_clean_architecture.app.AppException;
import javax.inject.Inject;

public class UserViewImpl implements UserView {

    @Inject
    UserController userController;

    public void clickRandomButton() {
        userController.getUser(0);
    }

    @Override
    public void renderSuccess(UserViewModel viewModel) {
        //TODO do ui stuff
    }

    @Override
    public void renderError(AppException exception) {
        //TODO do ui stuff
    }
}
