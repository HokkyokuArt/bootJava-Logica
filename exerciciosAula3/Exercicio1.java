package exerciciosAula3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double nota, total = 0;
			int aprovados = 0, reprovados = 0, count;

			for (count = 0; count < 10; count++) {
				System.out.printf("Insira a nota %d:\n", count + 1);
				nota = sc.nextDouble();
				total += nota;
				if (nota >= 6)
					aprovados++;
				else
					reprovados++;
			}

			System.out.printf("\nAlunos aprovados: %d\n", aprovados);
			System.out.printf("Alunos reprovados: %d\n", reprovados);
			System.out.printf("Media da turma: %.1f", total / count);

			sc.close();
		}

	}

}
