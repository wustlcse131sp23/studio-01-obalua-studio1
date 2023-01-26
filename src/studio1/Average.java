package studio1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("List two integers:");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = n1 + n2;
		double average = n3 / 2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average + ".");
	}

}
