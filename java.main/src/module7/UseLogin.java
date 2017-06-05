package module7;

/**
 * Created by citsym on 05.06.17.
 */
public class UseLogin {

    public static void main(String[] args) {

        try {
            processUserLogIn();
            giveTheAccessTouser("Vasya");
        } catch (PasswordInvalidException e) {
            System.err.println("User is not loged in. " + e.getMessage());
            storeInvalidePasswords(e.getInvalidPassword());
        }



    }

    private static void storeInvalidePasswords(String invalidPassword) {
        System.out.println(invalidPassword + " stored");
    }

    private static void processUserLogIn() {
        LoginService loginService = new LoginService();
        loginService.loginUser("Vasya", "123");
    }


    private static void giveTheAccessTouser(String vasya) {
        System.out.println("Permissions are given to " + vasya);
    }
}
