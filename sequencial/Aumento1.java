package sequencial;

import java.util.Scanner;

public class Aumento1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		double salarioBruto;

		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();

		salarioBruto*= 1.05;

		System.out.printf("O novo salário bruto é R$%.2f", salarioBruto);

		sc.close();
	}

}
