package exercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Implementação do exercício 1
 * 
 * @author samuel
 *
 * Farenheit para Celsius
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura
 * em graus Celsius utilizando a fórmula: C = (5 * (F-32) / 9).
 * 
 * Entrada
 *  A entrada contém um valor inteiro F (1 <= F <= 300) referente a temperatura em graus Farenheit.
 * Saída
*   A saída deve conter um valor inteiro referente a parte inteira da quantidade de graus celsius
* convertidas.
 *
 * Exemplo de entrada:
 * 171
 * Exemplo de saída:
 * O valor da temperatura em Celsius é: 77
 *
 */
public class exercicio_1 {

	public static void main(String[] args) {
		Integer farenheitValue;
		// Leitura do valor da temperatura em farenheit
		System.out.println("Entre com um valor de temperatura em Farenheit: ");
		try {
			Scanner input = new Scanner(System.in);
			farenheitValue = input.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida!");
			return;
		}
		
		//Validação da faixa de valores aceitáveis
		if ( farenheitValue >=1 & farenheitValue <=300) {
			//Cálculo de conversão
			Integer celsiusValue = (5 * (farenheitValue-32)/9);
			System.out.println("O valor da temperatura em Celsius é: " + celsiusValue);			
		} else {
			System.out.println("O valor da temperatura em farenheit deve ser ente 1 <= F <= 300.");
		}
	}
}
