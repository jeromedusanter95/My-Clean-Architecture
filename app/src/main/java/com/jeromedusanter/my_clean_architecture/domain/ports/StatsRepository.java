package com.jeromedusanter.my_clean_architecture.domain.ports;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;

public interface StatsRepository {

    void incrementNbTimesUserBeenFetchedInLocal(int userId) throws DomainException;
}
