package sef.module8.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
	// 1 - Type main method and call catchMe with 10 and 0

	public static void main(String[] args) {
		ArithmeticExceptionActivity arithmeticexceptionactivity = new ArithmeticExceptionActivity();
		arithmeticexceptionactivity.catchMe(10, 0);
	}

	void catchMe(int num1, int num2) {

		// The following code results in an Exception.
		// 2 - Identify the exception and write code to handle this exception.

		if (num2 == 0 || num1 == 0) {
			System.out.println("the result is 0");
		} else {
			int result = num1 / num2;
			System.out.println("the result is" + result);
		}

	}

	// 3 - After handling the exception, write a finally block which
	// prints a message "Thank you for using this program."

	// 4- try to call catchMe with 10 and 2 now and see which messages get
	// printed.

}
