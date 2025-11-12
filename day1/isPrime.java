package week1.day1;

import java.util.Scanner;

public class isPrime {
	 public static boolean isPrime1(int num) {
	        if (num <= 1) {
	            return false; // 0 and 1 are not prime
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // divisible by something other than 1 and itself
	            }
	           
	        }
	        return true; // number is prime
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        

	        if (isPrime1(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        sc.close();
}
}

