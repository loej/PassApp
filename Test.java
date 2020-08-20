import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String identifier = "12131$414secretPW efwefwfwgwgwgwg";
        
        //convert string to big integer
        BigInteger identifierBI = new BigInteger(identifier.getBytes());
        System.out.println("converted to Big Integer: " + identifierBI);

        //convert the big integer back to identifier and verify
        String verifyIdentifier = new String(identifierBI.toByteArray());
        System.out.println("Big Integer converted back to string val: " + verifyIdentifier);
    }
}