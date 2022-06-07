package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		double salarioBruto,novoSalarioBruto, percentual;

		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();

		novoSalarioBruto= percentual/100*salarioBruto+salarioBruto;

		System.out.printf("O salário bruto foi de R$%.2f para R$%.2f", salarioBruto,novoSalarioBruto);

		sc.close();

	}

}
