import org.mindrot.jbcrypt.BCrypt;
// public String hashPassword(String password) throws NoSuchAlgorithmException {
//     MessageDigest md = MessageDigest.getInstance("MD5");
//     md.update(password.getBytes());
//     byte[] digest = md.digest();
//     return DatatypeConverter.printHexBinary(digest);
// }

//corrected code
public class Passwords {
    // hash for storage
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    // verify
    public static boolean verify(String candidate, String storedHash) {
        return BCrypt.checkpw(candidate, storedHash);
    }
}