package com.jeromedusanter.my_clean_architecture.domain.ports;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;
import com.jeromedusanter.my_clean_architecture.domain.entities.User;

public interface UserRepository {

    User getUserFromLocal(int userId) throws DomainException;

    User fetchUser(int userId) throws DomainException;

    void saveUserInLocal(User user) throws DomainException;
}
