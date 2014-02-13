/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// complete the code to print text value of 8, 9 and 10
			NumToWordsUsingMethod obj = new NumToWordsUsingMethod();
			
			obj.printMyWord(8);
			obj.printMyWord(9);
			obj.printMyWord(10);
			
			NumToWords novoobjeto = new NumToWords();
			novoobjeto.printMyWord(1);
			novoobjeto.printMyWord(3);
			novoobjeto.printMyWord(5);
		}

		private void printMyWord(int i) {
			System.out.println("NumToWordsUsingMethod.NumToWords");
			
			final String numText;
			switch(i) {
			case 1:
				numText = "ONE";break;
			case 2:
				numText = "TWO";break;
			case 3:
				numText = "THREE";break;
			case 4:
				numText = "FOUR";break;
			case 5:
				numText = "FIVE";break;
			case 6:
				numText = "SIX";break;
			case 7:
				numText = "SEVEN";break;
			case 8:
				numText = "EIGHT";break;
			case 9:
				numText = "NINE";break;
			case 10:
				numText = "TEN";break;
			default:
				numText = "NUMBER " + i;
			}
			System.out.println(numText);
			
		}


		

	}
