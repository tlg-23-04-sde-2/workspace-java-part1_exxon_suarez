package com.entertainment;
// Application specific custom exception class - checked exception.

public class InvalidVolumeException extends Exception {

    public InvalidVolumeException() {
    }

    public InvalidVolumeException(String message) {
        super(message);
    }

    public InvalidVolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVolumeException(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {

    }
}