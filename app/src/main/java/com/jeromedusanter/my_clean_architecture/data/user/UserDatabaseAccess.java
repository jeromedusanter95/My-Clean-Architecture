package com.jeromedusanter.my_clean_architecture.data.user;

import com.jeromedusanter.my_clean_architecture.data.DataException;

interface UserDatabaseAccess {

    void saveUser(UserData user) throws DataException;

    UserData getUser(int userId) throws DataException;
}
