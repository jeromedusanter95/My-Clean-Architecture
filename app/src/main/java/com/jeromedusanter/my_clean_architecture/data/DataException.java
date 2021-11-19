package com.jeromedusanter.my_clean_architecture.data;

public class DataException extends Exception {

    public static class LocalDatabaseException extends DataException {

        public static class NoResourceFound extends LocalDatabaseException {

        }

        public static class NoDatabaseFound extends LocalDatabaseException {

        }

        public static class Unknown extends LocalDatabaseException {

        }
    }

    public static class ServerException extends DataException {

        public static class NoNetworkException extends ServerException {

        }

        public static class BadRequestException extends ServerException {

        }

        public static class NoGatewayException extends ServerException {

        }

        public static class Unknown extends ServerException {

        }
    }
}
