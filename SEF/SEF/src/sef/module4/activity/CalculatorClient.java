package sef.module4.activity;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator basicCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_NORMAL);
		
		System.out.println("*** Calculations will be performed using "+basicCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = basicCalc.add(4, 5);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = basicCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result); 
		
		

	}


	

}
