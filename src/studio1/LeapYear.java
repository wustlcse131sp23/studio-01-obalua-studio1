package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year:");
		int leap1 = in.nextInt();
		int leapyear1 = (leap1 / 4);
		double leapyear2 = leap1 / 4.0;
		boolean trueleap = (leapyear1 == leapyear2);
		System.out.println(leap1 + " is a leap year: " + trueleap);
	}

}
