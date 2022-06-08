package exerciciosAula2;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		int numeroDia;
		String nomeDia = "Teste";
		Scanner sc = new Scanner(System.in);

		

		System.out.println(
				"Selecione o número respectivo ao dia da semana que deseja?:\n1. Domingo\n2. Segunda\n3. Terça\n4. Quarta\n5. Quinta\n6. Sexta\n7. Sábado");
		numeroDia = sc.nextInt();

		switch (numeroDia) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Terça";
			break;
		case 4:
			nomeDia = "Quarta";
			break;
		case 5:
			nomeDia = "Quinta";
			break;
		case 6:
			nomeDia = "Sexta";
			break;
		case 7:
			nomeDia = "Sábado";
			break;
		default:
			System.out.println("Dia inválido");

		}

		System.out.printf("O dia selecionado foi %d: %s", numeroDia, nomeDia);

		sc.close();

	}

}
