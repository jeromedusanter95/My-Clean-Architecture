package com.jeromedusanter.my_clean_architecture.domain.usecases.user;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;
import com.jeromedusanter.my_clean_architecture.domain.entities.User;
import com.jeromedusanter.my_clean_architecture.domain.ports.StatsRepository;
import com.jeromedusanter.my_clean_architecture.domain.ports.UserRepository;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserParams;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.fetch.FetchUserResponse;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserParams;
import com.jeromedusanter.my_clean_architecture.domain.usecases.user.get.GetUserResponse;

public class UserInteractor implements UserInputPort {

    private final UserRepository userRepository;
    private final StatsRepository statsRepository;

    public UserInteractor(UserRepository userRepository, StatsRepository statsRepository) {
        this.userRepository = userRepository;
        this.statsRepository = statsRepository;
    }

    @Override
    public void executeGetUserUseCase(GetUserParams params, UserOutputPort outputPort) {
        try {
            User user = userRepository.getUserFromLocal(params.getUserId());
            outputPort.onGetUserSucceeded(new GetUserResponse.Success(user));
        } catch (DomainException.Local localException) {
            try {
                User user = userRepository.fetchUser(params.getUserId());
                userRepository.saveUserInLocal(user);
                statsRepository.incrementNbTimesUserBeenFetchedInLocal(params.getUserId());
                outputPort.onGetUserSucceeded(new GetUserResponse.Success(user));
            } catch (DomainException e) {
                outputPort.onGetUserFailed(new GetUserResponse.Error(e));
            }
        } catch (DomainException e) {
            outputPort.onGetUserFailed(new GetUserResponse.Error(e));
        }
    }

    @Override
    public void executeFetchUserUseCase(FetchUserParams params, UserOutputPort outputPort) {
        try {
            User user = userRepository.fetchUser(params.getUserId());
            userRepository.saveUserInLocal(user);
            statsRepository.incrementNbTimesUserBeenFetchedInLocal(params.getUserId());
            outputPort.onFetchUserSucceeded(new FetchUserResponse.Success(user));
        } catch (DomainException e) {
            outputPort.onFetchUserFailed(new FetchUserResponse.Error(e));
        }
    }
}








