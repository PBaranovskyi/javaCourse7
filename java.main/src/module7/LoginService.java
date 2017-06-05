package module7;

/**
 * Created by citsym on 05.06.17.
 */
public class LoginService {


     public boolean loginUser(String login, String password){


         if (password.length() < 4){
             throw new PasswordInvalidException("Password is invalid for " + login, password);
         }

         return true;
     }
}
