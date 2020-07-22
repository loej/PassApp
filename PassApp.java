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

@SuppressWarnings("unchecked")
public class PassApp {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Tree pass = new Tree();
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

		System.out.println("Enter the website where you are trying to make a password for: ");
		final String location = sc.nextLine();

		final ArrayList<Character> password = pass.sort();
		System.out.println("Enter the desired password length: ");
		int passwordlength = sc.nextInt();
		final ArrayList<Character> passcode = new ArrayList<Character>();
		while (passwordlength != 0) {
			final int length = (int) (Math.random() * password.size());
			passcode.add(password.get(length));
			passwordlength--;
		}

		final char[] arr = new char[passcode.size()];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = passcode.get(i);
		}

		System.out.println("Enter what you would like to do today (create, delete, search): ");
		String response = sc.next();
		String textFile = "PasswordList.txt";
		if (response.contentEquals("create")) {
			try {
				Writer PasswordFile = new BufferedWriter(new FileWriter(textFile, true)); // clears file eve
				PasswordFile.append(location + " " + arr + "\n");
				PasswordFile.close();
			} catch (Exception e) {

			}
		} else if (response.contentEquals("search")) {
			System.out.println("What is the website you need the password for: ");
			String input = sc.next();
			System.out.println(textFile);
			File dir = new File(textFile);
			String[] str = dir.list();
			if(str == null){
				System.out.println("Mission failed");
				System.exit(1);
			} else {
				System.out.println("HIIIIIIII");
				for(int i = 0; i <= str.length - 1; i++){
					System.out.println("Almost");
					String fileName = str[i];
					if(fileName.contentEquals(input)){
						System.out.println("Mission Success");
						System.out.println(fileName);
					}
				}
			}
		}
	}
}
