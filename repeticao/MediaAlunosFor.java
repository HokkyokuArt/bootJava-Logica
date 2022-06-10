package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double total = 0;
			int contador;
			
			for (contador = 0; contador <10; contador++) {
				System.out.printf("\nDigite a %dª nota: \n", contador + 1);
				double nota = sc.nextDouble();
				total += nota;
			}
			 
			double media = total / contador;

			System.out.printf("\n\nTotal de todas as notas é %.1f", total);
			System.out.printf("\nTotal de alunos %d", contador);
			System.out.printf("\nMédia da classe é %.1f", media);

			sc.close();
		}

	}

}
