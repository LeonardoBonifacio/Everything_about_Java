package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

public class LoginInvalidException extends Exception {

    public LoginInvalidException() {
        super("invalid Login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
