package exerciciosAula2;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {

		double renda, aliquota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a sua renda: ");
		renda = sc.nextDouble();

		if (renda <= 1903.98) {
			aliquota = 0;
		} else if (renda <= 2826.65) {
			aliquota = 7.5;
		} else if (renda <= 3751.06) {
			aliquota = 15;
		} else if (renda <= 4664.68) {
			aliquota = 22.5;
		} else {
			aliquota = 27.5;
		}
		
		System.out.printf("Renda: R$ %.2f\n", renda);
		System.out.printf("Aliquota: %.1f\n", aliquota);
		System.out.printf("Dedução de imposto de renda: R$ %.2f\n", aliquota/100*renda);

		sc.close();

	}

}
