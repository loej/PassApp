import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@SuppressWarnings("unchecked")
public class PassApp {

	//Insert into the Tree everything from letters to special characters
	public static void insert(Tree pass){
		pass.insert('A');
		pass.insert('B');
		pass.insert('C');
		pass.insert('D');
		pass.insert('E');
		pass.insert('F');
		pass.insert('G');
		pass.insert('H');
		pass.insert('I');
		pass.insert('J');
		pass.insert('K');
		pass.insert('L');
		pass.insert('M');
		pass.insert('N');
		pass.insert('O');
		pass.insert('P');
		pass.insert('Q');
		pass.insert('R');
		pass.insert('S');
		pass.insert('T');
		pass.insert('U');
		pass.insert('V');
		pass.insert('W');
		pass.insert('X');
		pass.insert('Y');
		pass.insert('Z');

		pass.insert('a');
		pass.insert('b');
		pass.insert('c');
		pass.insert('d');
		pass.insert('e');
		pass.insert('f');
		pass.insert('g');
		pass.insert('h');
		pass.insert('i');
		pass.insert('j');
		pass.insert('k');
		pass.insert('l');
		pass.insert('m');
		pass.insert('n');
		pass.insert('o');
		pass.insert('p');
		pass.insert('q');
		pass.insert('r');
		pass.insert('s');
		pass.insert('t');
		pass.insert('u');
		pass.insert('v');
		pass.insert('w');
		pass.insert('x');
		pass.insert('y');
		pass.insert('z');

		pass.insert('1');
		pass.insert('2');
		pass.insert('3');
		pass.insert('4');
		pass.insert('5');
		pass.insert('6');
		pass.insert('7');
		pass.insert('8');
		pass.insert('9');
		pass.insert('0');

		pass.insert('!');
		pass.insert('@');
		pass.insert('#');
		pass.insert('$');
		pass.insert('%');
		pass.insert('^');
		pass.insert('&');
		pass.insert('*');
	}	

	public static void generate(Tree pass, int length, ArrayList<Character>password, ArrayList<Character>passcode){
		Random rand = new Random();
		password = pass.sort(); 
		while(length != 0){
			passcode.add(password.get(rand.nextInt(password.size())));
			length--;
		}
	}

	public static void main(final String[] args) {
		// Starting 
		Scanner sc = new Scanner(System.in);
		Tree pass = new Tree();
		insert(pass);

		// Generate the password length and security
		System.out.println("Enter the website where you are trying to make a password for: ");
		String location = sc.nextLine();
		System.out.println("Enter the desired password length: ");
		int length = sc.nextInt();
		ArrayList<Character> password = new ArrayList<Character>();
		ArrayList<Character> passcode = new ArrayList<Character>();
		generate(pass, length, password, passcode);
	}
}
