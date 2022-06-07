package sequencial;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double  n1,n2,n3, media;
		 
		System.out.println("Insira a nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Insira a nota 2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Insira a nota 3: ");
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
	
		System.out.printf("A media foi de %.1f",media);
		
		sc.close();
		

	}

}
