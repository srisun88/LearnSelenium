package week1.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println("The value of the odd number now is:" + i);

			} else if (i % 2 == 0) {
				System.out.println("The value of the even number now is:" + i);
			}
		}
	}

}
