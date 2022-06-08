package exerciciosAula1;

import java.util.Scanner;

public class DescontoINSS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario,salarioDescontado;
		
		System.out.println("Insira o salario: ");
		salario = sc.nextDouble();
		
		salarioDescontado = salario * 0.89;
		
		System.out.printf("Salario bruto: R$%.2f\nSalario INSS Descontado: R$%.2f", salario,salarioDescontado);
		
		sc.close();

	}

}
