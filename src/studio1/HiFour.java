package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Hi, what's your name?");
		String s0 = in.nextLine();
		System.out.print("Hello, " + s0 + ", what is your friend's name?");
		String s1 = in.nextLine();
		System.out.print("Nice to meet you, " + s1 + ", what is the name of the the third person?");
		String s2 = in.nextLine();
		System.out.print("Hey, " + s2 + ", what is the last person's name?");
		String s3 = in.nextLine();
		System.out.println("Hey, " + s0 + ", " + s1 + ", " + s2 + ", " + s3 + ", it is so nice to meet you all!");
		System.out.println("Hope you guys enjoy your day.");
		// Say hello to the names in s0 through s3.
		//

	}
}
