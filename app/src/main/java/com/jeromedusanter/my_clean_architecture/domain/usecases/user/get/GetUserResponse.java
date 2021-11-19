package com.jeromedusanter.my_clean_architecture.domain.usecases.user.get;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;
import com.jeromedusanter.my_clean_architecture.domain.entities.User;

public class GetUserResponse {

    public static class Success extends GetUserResponse {

        private User user;

        public Success(User user) {
            this.user = user;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    public static class Error extends GetUserResponse {

        private DomainException exception;

        public Error(DomainException exception) {
            this.exception = exception;
        }

        public DomainException getException() {
            return exception;
        }

        public void setException(DomainException exception) {
            this.exception = exception;
        }
    }
}
