package exercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Integer farenheitValue;
		System.out.println("Entre com um valor de temperatura em Farenheit: ");
		
		try {
			Scanner input = new Scanner(System.in);
			farenheitValue = input.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida!");
			return;
		}

		if ( farenheitValue >=1 & farenheitValue <=300) {
			Integer celsiusValue = (5 * (farenheitValue-32)/9);
			System.out.println("O valor da temperatura em Celsius é: " + celsiusValue);			
		} else {
			System.out.println("O valor da temperatura em farenheit deve ser ente 1 <= F <= 300.");
		}
	}

}
