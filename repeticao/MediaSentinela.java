package repeticao;

import java.util.Scanner;

public class MediaSentinela {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		int contador = 0;
		
		System.out.printf("\nDigite uma nota ou -1 para sair: \n", contador + 1);
		double nota = sc.nextDouble();
		
		while (nota != -1) {
			total += nota; 
			contador++; 
			System.out.printf("\nDigite uma nota ou -1 para sair: \n", contador + 1);
			nota = sc.nextDouble();
		}
		
		if(contador !=0) {
			double media = total / contador;

			System.out.printf("\n\nTotal de todas as notas é %.1f", total);
			System.out.printf("\nTotal de alunos %d", contador);
			System.out.printf("\nMédia da classe é %.1f", media);
		} else {
			System.out.println("Sem notas cadastradas.");
		}
		

		sc.close();

	}

}
