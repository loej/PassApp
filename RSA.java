import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    final static SecureRandom random = new SecureRandom();
    final static BigInteger one = new BigInteger("1");
    static BigInteger n, e, d;

    // Lets first generate the key pair
    public RSA(int N){ //N will represent the level of encryption 
        BigInteger p = BigInteger.probablePrime(N/2, random);
        BigInteger q = BigInteger.probablePrime(N/2, random);
        /* n = (p.subtract(one)).multiply(q.subtract(one)); */
        n = p.multiply(q);
        e = new BigInteger("65537"); //By common practice it should be 2^16+1
        d = e.modInverse(n); //Private Key
    }

    public static BigInteger encrpyt(BigInteger message){
        return message.modPow(e, n);
    }

    public static BigInteger decrypt(BigInteger encrpyt){
        return encrpyt.modPow(d, n);
    }

    public static BigInteger toBigInt(String message){
        byte[] bytes = message.getBytes();
        BigInteger newBigInt = new BigInteger(bytes);
        return newBigInt;
    }

    public static void main(String[] args){
        String a = "ABC";
        BigInteger b = toBigInt(a);
        BigInteger c;
        c.encrpyt(b);
        System.out.println(c);
    }
}