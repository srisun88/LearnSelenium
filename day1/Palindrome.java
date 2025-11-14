package week1.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int first = input;
		int rem = 0;

		while (input != 0) {
			int d = input % 10;
			rem = rem * 10 + d;
			input = input / 10;
		}
		if (first == rem) {
			System.out.println(first + " is a palindrome number.");
		} else {
			System.out.println(rem + " is a not palindrome number.");
		}

	}

}
