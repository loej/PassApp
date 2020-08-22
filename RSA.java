import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;


public class RSA {

    final static SecureRandom random = new SecureRandom();
    final static BigInteger one = new BigInteger("1");
    static BigInteger n, e, d;

    // Lets first generate the key pair
    public RSA(){ //N will represent the level of encryption 
        int N = 50;
        BigInteger p = BigInteger.probablePrime(N/2, random);
        BigInteger q = BigInteger.probablePrime(N/2, random);
        BigInteger n1 = (p.subtract(one)).multiply(q.subtract(one));
        n = p.multiply(q);
        e = new BigInteger("65537"); //By common practice it should be 2^16+1
        d = e.modInverse(n1); //Private Key
    }

    public static BigInteger encrpytMethod(BigInteger message){
        return message.modPow(e, n);
    }

    public static BigInteger decrypt(BigInteger encrpyt){
        return encrpyt.modPow(d, n);
    }

    public static BigInteger toBigInt(String message) throws UnsupportedEncodingException{
        BigInteger toBigInt = new BigInteger(message.getBytes());
        System.out.println("BigInt of String" + ": " + toBigInt);
        return toBigInt;
    }

    public static String toMessage(BigInteger decrypt) {
        String newString = "";
        newString += new String(decrypt.toByteArray());
        return newString;
    } 

    public static void main(String[] args) throws UnsupportedEncodingException{
        Scanner sc = new Scanner(System.in);
        RSA key = new RSA();
        System.out.println("Enter your message: ");
        String message = new String(sc.nextLine());
        BigInteger a = key.toBigInt(message);
        BigInteger encryptionKey = key.encrpytMethod(a);
        BigInteger decryptionKey = key.decrypt(encryptionKey);
        String original = key.toMessage(decryptionKey);
        System.out.println("Decrypted message from encryption key" + ": " + original);
    }
}