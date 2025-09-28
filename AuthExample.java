// if (inputPassword.equals(user.getPassword())) {
// // Login success
// }

import org.mindrot.jbcrypt.BCrypt;

public class AuthExample {
    public static void main(String[] args) {

        // check password hashs for accuracy
        if (BCrypt.checkpw(inputPassword, user.getPasswordHash())) {
            // success
        } else {
            // fail
        }
    }
}