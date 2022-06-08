package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado;
		double n1,n2,n3,media;
		
		
		System.out.println("Informe as 3 notas: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		if(media>=6.0)
			resultado = "Aprovado";
		else 
			resultado = "Reprovado";
		
	
		System.out.printf("O aluno tirou %.1f, %.1f, %.1f e obteve media %.1f.\n", n1,n2,n3,media);
		System.out.printf("O aluno está %s.", resultado);
		
		
		sc.close();

	}

}
