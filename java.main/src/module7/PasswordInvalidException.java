package module7;

/**
 * Created by citsym on 05.06.17.
 */
public class PasswordInvalidException extends RuntimeException {
    private String invalidPassword;

    public PasswordInvalidException(String message, String password) {
        super(message);
        invalidPassword = password;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }
}
