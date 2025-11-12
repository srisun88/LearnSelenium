package week1.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first = num;
		int second = 0;

		while (num != 0) {
			int d = num % 10;
			second = second * 10 + d;
			num = num / 10;
		}
		if (first == second) {
			System.out.println(first + " is a palindrome number.");
		} else {
			System.out.println(second + " is a not palindrome number.");
		}

	}

}
