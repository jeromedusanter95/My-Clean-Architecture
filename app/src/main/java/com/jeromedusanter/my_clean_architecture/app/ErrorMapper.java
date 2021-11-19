package com.jeromedusanter.my_clean_architecture.app;

import com.jeromedusanter.my_clean_architecture.domain.DomainException;

public class ErrorMapper {

    public AppException mapDataToDomainException(DomainException e) {
        if (e instanceof DomainException.Local) {
            return new AppException.Local();
        } else if (e instanceof DomainException.Server) {
            return new AppException.Server();
        } else {
            return new AppException.Unknown();
        }
    }
}
