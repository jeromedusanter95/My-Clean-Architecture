package com.jeromedusanter.my_clean_architecture.data.user;

import com.jeromedusanter.my_clean_architecture.data.DataException;
import retrofit2.HttpException;

public class UserRemoteDatabaseAccessImpl implements UserDatabaseAccess {

    @Override
    public void saveUser(UserData user) throws DataException {
        try {
            //TODO save user from server
        } catch (HttpException httpException) {
            switch (httpException.code()) {
                default:
                    throw new DataException.ServerException.Unknown();
            }
        }
    }

    @Override
    public UserData getUser(int userId) throws DataException {
        try {
            //TODO get user from server
        } catch (HttpException httpException) {
            switch (httpException.code()) {
                default:
                    throw new DataException.ServerException.Unknown();
            }
        }
        return null;
    }
}
