package week1.day1;

public class Fibonacci {

	    public static void main(String[] args) {
	        int n = 8; // number of terms to display
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Series up to " + n + " terms: ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");

	            // compute next term
	            int next = first + second;
	            first = second;
	            second = next;
	          //  int a =(type[]) collection.toArray(new type[collection.size()]);
	        }
	    }
	}
