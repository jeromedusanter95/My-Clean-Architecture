package com.jeromedusanter.my_clean_architecture.data;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;
import com.jeromedusanter.my_clean_architecture.domain.DomainException.Local;
import com.jeromedusanter.my_clean_architecture.domain.DomainException.Server;
import com.jeromedusanter.my_clean_architecture.domain.DomainException.Unknown;

public class ErrorMapper {

    public DomainException mapDataToDomainException(DataException e) throws Local, Server, Unknown {
        if (e instanceof DataException.LocalDatabaseException) {
            throw new Local();
        } else if (e instanceof DataException.ServerException) {
            throw new Server();
        } else {
            throw new Unknown();
        }
    }
}
