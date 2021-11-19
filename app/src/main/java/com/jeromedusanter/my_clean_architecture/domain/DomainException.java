package com.jeromedusanter.my_clean_architecture.domain;

public class DomainException extends Exception {

    public static class Server extends DomainException {

    }

    public static class Local extends DomainException {

    }

    public static class Unknown extends DomainException {

    }
}
