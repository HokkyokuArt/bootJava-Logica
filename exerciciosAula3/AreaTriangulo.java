package exerciciosAula3;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base,altura;
		
		
		do {
			System.out.println("Insira a base:");
			base = sc.nextDouble();
			System.out.println("Insira a altura:");
			altura = sc.nextDouble();
			if(base <= 0 || altura <= 0) {
				System.out.println("\nATENÇÃO: Base e altura devem ser maiores que 0.\n");
				
			}
			
		}while(base <= 0 || altura <= 0);
		
		
		
		System.out.printf("A área deste triangulo é de %.1f", base*altura/2);
		
		sc.close();
		
	
		

	}

}
