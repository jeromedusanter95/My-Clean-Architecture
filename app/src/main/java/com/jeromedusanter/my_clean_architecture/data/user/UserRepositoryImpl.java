package com.jeromedusanter.my_clean_architecture.data.user;

import com.jeromedusanter.my_clean_architecture.data.DataException;
import com.jeromedusanter.my_clean_architecture.data.ErrorMapper;
import com.jeromedusanter.my_clean_architecture.domain.DomainException;
import com.jeromedusanter.my_clean_architecture.domain.entities.User;
import com.jeromedusanter.my_clean_architecture.domain.ports.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    private final UserDatabaseAccess userLocalDatabaseAccess;
    private final UserDatabaseAccess userRemoteDatabaseAccess;
    private final ErrorMapper errorMapper;

    public UserRepositoryImpl(
        UserDatabaseAccess userLocalDatabaseAccess,
        UserDatabaseAccess userRemoteDatabaseAccess,
        ErrorMapper errorMapper
    ) {
        this.userLocalDatabaseAccess = userLocalDatabaseAccess;
        this.userRemoteDatabaseAccess = userRemoteDatabaseAccess;
        this.errorMapper = errorMapper;
    }

    @Override
    public User getUserFromLocal(int userId) throws DomainException {
        UserData data;
        try {
            data = userLocalDatabaseAccess.getUser(userId);
            return new User(data.getId(), data.getName());
        } catch (DataException e) {
            e.printStackTrace();
            throw errorMapper.mapDataToDomainException(e);
        }
    }

    @Override
    public User fetchUser(int userId) throws DomainException {
        UserData data;
        try {
            data = userRemoteDatabaseAccess.getUser(userId);
            return new User(data.getId(), data.getName());
        } catch (DataException e) {
            e.printStackTrace();
            throw errorMapper.mapDataToDomainException(e);
        }
    }

    @Override
    public void saveUserInLocal(User user) throws DomainException {
        UserData data = new UserData(user.getId(), user.getName());
        try {
            userLocalDatabaseAccess.saveUser(data);
        } catch (DataException e) {
            e.printStackTrace();
            throw errorMapper.mapDataToDomainException(e);
        }
    }
}
