package exercicio_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Integer studentsNumber = 0;
		System.out.println("Entre com a quantidade de alunos: ");
		try {
			studentsNumber = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida de quantidade de alunos na fila!");
			return;
		}

		System.out.println("Entre com a lista de notas: ");
		List<Integer> queue = new ArrayList<Integer>();
		try {
			String gradesInput = input2.nextLine();
			
			for (String strInteger : gradesInput.split(" ")) {
				queue.add(Integer.parseInt(strInteger));
			}
			
			if (queue.size() != studentsNumber) {
				System.out.println("Quantidade de alunos diferente da quantidade de notas!");
				return;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Valor de sequência de notas inválida!");
			return;
		}

		List<Integer> sortedQueue = new ArrayList<Integer>();
		sortedQueue.addAll(queue);
		 Collections.sort(sortedQueue, Collections.reverseOrder());
				
		Integer count = 0;
		for (int i = 0; i < queue.size(); i++) {
			if (queue.get(i) == sortedQueue.get(i)) {
				count++;
			}
		}
		System.out.println("O número de alunos que não precisaram trocar de posição é: " + count);
	}

}
