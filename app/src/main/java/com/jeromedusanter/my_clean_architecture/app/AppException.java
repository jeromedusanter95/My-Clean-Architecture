package com.jeromedusanter.my_clean_architecture.app;

public class AppException extends Exception {

    public static class NoNetwork extends AppException {

    }

    public static class Server extends AppException {

    }

    public static class Local extends AppException {

    }

    public static class Unknown extends AppException {

    }
}
