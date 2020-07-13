package exercicio_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Implementação do exercício 2
 * @author samuel
 *
 * Fila do Recreio
 * Na escola onde você estuda, a hora do recreio é a mais aguardada pela grande maioria dos alunos.
 * Não só porque as vezes as aulas são cansativas, mas sim porque a merenda servida é muito boa,
 * preparada por um chefe italiano muito caprichoso.
 * Quando bate o sinal para a hora do recreio, todos os alunos saem correndo da sua sala para chegar o
 * mais cedo possível na cantina, tanta é a vontade de comer. Um de seus professores notou, porém,
 * que havia ali uma oportunidade.
 * Utilizando um sistema de recompensa, seu professor de matemática disse que a ordem da fila para se
 * servir será dada não pela ordem de chegada, mas sim pela soma das notas obtidas em sala de aula.
 * Assim, aqueles com maior nota poderão se servir antes daqueles que tem menor nota.
 * Sua tarefa é simples: dada a ordem de chegada dos alunos na cantina, e as suas respectivas notas na
 * matéria de matemática, reordene a fila de acordo com as notas de matemática, e diga quantos
 * alunos não precisaram trocar de lugar nessa
 * 
 * Entrada
 *  A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir. Cada caso de
 *  teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de alunos.
 *  Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica a nota do i-
 *  ésimo aluno.
 *  Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao
 *  primeiro aluno a chegar na fila, o segundo inteiro diz respeito ao segundo aluno, e assim
 *  sucessivamente.
 * 
 * Saída
 * Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de alunos que
 * não precisaram trocar de lugar mesmo após a fila ser reordenada.
 * 
 * Exemplo de entrada:
 * Entre com a quantidade de alunos: 
 * 3
 * Entre com a lista de notas: 
 * 100 80 90
 * 
 * Exemplo de saída:
 * O número de alunos que não precisaram trocar de posição é: 1
 * 
 */
public class exercicio_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Integer studentsNumber = 0;
		
		//Leitura da quantidade de alunos
		System.out.println("Entre com a quantidade de alunos: ");
		try {
			studentsNumber = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida de quantidade de alunos na fila!");
			return;
		}

		//Leitura da lista de notas
		System.out.println("Entre com a lista de notas: ");
		List<Integer> queue = new ArrayList<Integer>();
		try {
			String gradesInput = input2.nextLine();
			
			for (String strInteger : gradesInput.split(" ")) {
				queue.add(Integer.parseInt(strInteger));
			}
			
			//Validação da quantidade de notas não é diferente da quantidade de alunos 
			if (queue.size() != studentsNumber) {
				System.out.println("Quantidade de alunos diferente da quantidade de notas!");
				return;
			}
		} catch (InputMismatchException e) {
			System.out.println("Valor de sequência de notas inválida!");
			return;
		}

		//Criação da lista ordenada
		List<Integer> sortedQueue = new ArrayList<Integer>();
		sortedQueue.addAll(queue);
		 Collections.sort(sortedQueue, Collections.reverseOrder());
				
		//Algoritmo de comparação para avaliar os alunos que não mudaram de posição
		Integer count = 0;
		for (int i = 0; i < queue.size(); i++) {
			if (queue.get(i) == sortedQueue.get(i)) {
				count++;
			}
		}
		System.out.println("O número de alunos que não precisaram trocar de posição é: " + count);
	}

}
