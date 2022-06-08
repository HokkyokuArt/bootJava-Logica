package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado;
		double altura, peso, imc;

		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();

		imc = peso / Math.pow(altura, 2);

		if (imc < 18) {
			resultado = "Abaixo do peso";
		} else if (imc < 25) {
			resultado = "Peso normal";
		} else if (imc < 30) {
			resultado = "Sobrepeso";
		} else if (imc < 35) {
			resultado = "Obesidade nivel I";
		}else if(imc <40) {
			resultado = "Obesidade nivel II";
		}else {
			resultado = "Obesidade mórbida";
		}

		System.out.printf("O seu IMC é %.2f está classificado como %s", imc, resultado);

		sc.close();

	}

}
