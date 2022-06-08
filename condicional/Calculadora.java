package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcao;
		double num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor 1: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o valor 2: ");
		num2 = sc.nextDouble();

		System.out.println("\nInforme a operação:\n" + "1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n");

		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
			break;
		case 2:
			System.out.printf("%f + %f = %f", num1, num2, num1 - num2);
			break;
		case 3:
			System.out.printf("%f + %f = %f", num1, num2, num1 * num2);
			break;
		case 4:
			System.out.printf("%f + %f = %f", num1, num2, num1 / num2);
			break;
		default:
			System.out.println("Operação inválida");

		}

		sc.close();
	}

}
