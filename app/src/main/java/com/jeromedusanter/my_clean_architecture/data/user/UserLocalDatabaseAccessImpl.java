package com.jeromedusanter.my_clean_architecture.data.user;

import android.database.sqlite.SQLiteException;
import com.jeromedusanter.my_clean_architecture.data.DataException;

public class UserLocalDatabaseAccessImpl implements UserDatabaseAccess {

    @Override
    public void saveUser(UserData user) throws DataException {
        try {
            //TODO Get user from local
        } catch (SQLiteException sqLiteException) {
            switch (sqLiteException.getMessage()) {
                default:
                    throw new DataException.LocalDatabaseException.Unknown();
            }
        }
    }

    @Override
    public UserData getUser(int userId) throws DataException {
        try {
            //TODO Get user from local
        } catch (SQLiteException sqLiteException) {
            switch (sqLiteException.getMessage()) {
                default:
                    throw new DataException.LocalDatabaseException.Unknown();
            }
        }
        return null;
    }
}
