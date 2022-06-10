package exerciciosAula3;

import java.util.Scanner;

public class AumentoSalarioMinimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			double salario = 1000;
			int ano, percentual;
			
			
			
			
			
			
			
			salario+= (salario*0.088); // 
			salario+= (salario*0.1167);
			salario+= (salario*0.0647);

			System.out.printf("Salario atual (2022): R$ %.1f", salario);

			sc.close();

	}

}
