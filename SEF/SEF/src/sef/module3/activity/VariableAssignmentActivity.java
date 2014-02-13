/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class VariableAssignmentActivity {

	static int UUID = 12345;
	private int numeroConta = 11111;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Declare a variable of type int and assign it default value.
	//	int valor = 2;
		
		// 2- Update the value 
	//	valor +=10;
		// 3- Print updated value to the console
	//	System.out.println(valor);
		
		
		VariableAssignmentActivity test = new VariableAssignmentActivity();
		
		System.out.println(VariableAssignmentActivity.UUID);
	}

	public void imprimir(){
		System.out.println(numeroConta);
	}
}
