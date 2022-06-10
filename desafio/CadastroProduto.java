package desafio;

import java.util.Scanner;

public class CadastroProduto {


	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Utilitarios ut = new Utilitarios();
			char sim, classe;
			int contador = 0, qtdProdutos = 15, qtd = 0, qtd1 = 0, qtd2 = 0, qtd3 = 0;
			double custoUn = 0, custo1 = 0, custo2 = 0, custo3 = 0, aliquota = 0 , lucro = 0,precoSugerido=0, precoSugerido1=0,precoSugerido2=0,precoSugerido3=0;
			String nomeProduto = null;


			System.out.println("\n                                              CADASTRO DE PRODUTOS"
					+ "\n_______________________________________________________________________________________________________________________\n");
			System.out.println(
					"Hey, Vamos inciar o cadastro dos produtos do seus estoques? Afinal, um estoque bem organizado não faz mal a ninguem né?\n");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println("(Digite 'S' para continuar)");
			sim = sc.next().charAt(0);
			sim = Character.toUpperCase(sim);

			while (sim != 'S') {

				System.out.println("\nOk, eu aguardo... Quando quiser começar, basta me dizer :)\n");
				System.out.println("(Digite 'S' para continuar)");
				sim = sc.next().charAt(0);
				sim = Character.toUpperCase(sim);
			}

			ut.clear();
			for (contador = 0; contador < qtdProdutos; contador++) {

			System.out.println(
					"\nCerto, vamos lá então.\nMe informa a classe desse produto por favor:\n\nC = cama, mesa e banho\nE = eletrodomésticos\nV = Vestuário\n");
			classe = sc.next().charAt(0);
			classe = Character.toUpperCase(classe);

			while (classe != 'C' && classe != 'E' && classe != 'V') {
				System.out.println(
						"\nCara, desculpa, mas essa classe não existe... Verifica essa informação pra mim e insere de novo a classe:\n\nC = cama, mesa e banho\nE = eletrodomésticos\nV = Vestuário\n");
				classe = sc.next().charAt(0);
				classe = Character.toUpperCase(classe);
			}

			switch (classe) {
			case 'C':
				System.out.println("\nQual o nome do produto?");
				nomeProduto = sc.next();
				System.out.println("\nBeleza! Quanto custou a unidade desse produto?");
				custoUn = sc.nextDouble();

				while (custoUn <= 0) {
					System.out.println("Opa! Tem q dar um preço pro produto...\nQual o preço do produto?");
					custoUn = sc.nextDouble();
				}

				System.out.println("\nAnotado! Qual a quantidade desse produto no seu estoque?");
				qtd = sc.nextInt();

				while (qtd < 0) {
					System.out.println("\nMe ajuda a te ajudar... Coloca um número positivo pra quantidade por favor:");
					qtd = sc.nextInt();
				}

				custo1 += custoUn * qtd;
				qtd1 += qtd;
				aliquota = 37.41;
				lucro = 30;
				precoSugerido = custoUn + (aliquota/100*custoUn) + (lucro/100*custoUn);
			    precoSugerido1 += precoSugerido *qtd;

				
				break;
			case 'E':
				System.out.println("\nQual o nome do produto?");
				nomeProduto = sc.next();
				System.out.println("\nBeleza! Quanto custou a unidade desse produto?");
				custoUn = sc.nextDouble();

				while (custoUn <= 0) {
					System.out.println("Opa! Tem q dar um preço pro produto...\nQual o preço do produto?");
					custoUn = sc.nextDouble();
				}

				System.out.println("\nAnotado! Qual a quantidade desse produto no seu estoque?");
				qtd = sc.nextInt();

				while (qtd < 0) {
					System.out.println("\nMe ajuda a te ajudar... Coloca um número positivo pra quantidade por favor:");
					qtd = sc.nextInt();
				}

				custo2 += custoUn * qtd;
				qtd2 += qtd;
				aliquota = 43.14;
				lucro = 35;
				precoSugerido = custoUn + (aliquota/100*custoUn) + (lucro/100*custoUn);
			    precoSugerido2 += precoSugerido * qtd ;
				
				break;
			case 'V':
				System.out.println("\nQual o nome do produto?");
				nomeProduto = sc.next();
				System.out.println("\nBeleza! Quanto custou a unidade desse produto?");
				custoUn = sc.nextDouble();

				while (custoUn <= 0) {
					System.out.println("Opa! Tem q dar um preço pro produto...\nQual o preço do produto?");
					custoUn = sc.nextDouble();
				}

				System.out.println("\nAnotado! Qual a quantidade desse produto no seu estoque?");
				qtd = sc.nextInt();

				while (qtd < 0) {
					System.out.println("\nMe ajuda a te ajudar... Coloca um número positivo pra quantidade por favor:");
					qtd = sc.nextInt();
				}

				custo3 += custoUn * qtd;
				qtd3 += qtd;
				aliquota = 38.42;
				lucro = 50;
				precoSugerido = custoUn + (aliquota/100*custoUn) + (lucro/100*custoUn);
			    precoSugerido3 += precoSugerido *qtd;
				
				break;
			}

			ut.clear();
			System.out.println("Cadastrando.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			ut.clear();
			System.out.println("Cadastrando. .");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			ut.clear();
			System.out.println("Cadastrando. . .");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			ut.clear();

			System.out.printf(
					"\nParabéns!!! Voce cadastrou o produto número %d.\n\nNome do produto: %s\nClasse: %c\nCusto por UN: R$ %.2f\nQuantidade em estoque: %d\n",
					contador + 1, nomeProduto, classe, custoUn, qtd);
			
			System.out.printf("Alíquota por UN: %.2f por cento\n", aliquota);
			System.out.printf("Margem de lucro por UN: %.0f por cento\n", lucro);
			System.out.printf("Preço sugerido por UN: R$ %.2f\n\n\n", custoUn + (aliquota/100*custoUn) + (lucro/100*custoUn));

			if(contador+1<qtdProdutos) {
				System.out.println("Vamos para o proximo produto?");
				System.out.println("(Digite 'S' para continuar)");
				sim = sc.next().charAt(0);
				sim = Character.toUpperCase(sim);
				while (sim != 'S') {

					System.out.println("\nOk, eu aguardo... Quando quiser continuar, você já sabe o que fazer.. :)\n");
					System.out.println("(Digite 'S' para continuar)");
					sim = sc.next().charAt(0);
					sim = Character.toUpperCase(sim);
				}

			} else {
				System.out.println("Esse foi o último produto. Estoque catalogado com sucesso!");
				System.out.println("(Digite 'S' para continuar)");
				sim = sc.next().charAt(0);
				sim = Character.toUpperCase(sim);
				while (sim != 'S') {

					System.out.println("\nQuando quiser...\n");
					System.out.println("(Digite 'S' para continuar)");
					sim = sc.next().charAt(0);
					sim = Character.toUpperCase(sim);
				}
				ut.clear();
				System.out.println("Vamos aos números...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println("(Mistério...)");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
			}
			
			ut.clear();

			} // Fim do for 
			
			System.out.println("TA DAAAAAA!!!\n");
			
			System.out.printf("Quantidade de produtos em estoque da classe C: %d\n", qtd1);
			System.out.printf("Custo dos produtos em estoque da classe C: R$ %.2f\n", custo1);
			System.out.printf("Valor líquido sugerido para os produtos em estoque da classe C: R$ %.2f\n\n", precoSugerido1);

			System.out.printf("Quantidade em estoque da classe E: %d\n", qtd2);
			System.out.printf("Custo dos produtos em estoque da classe E: R$ %.2f\n", custo2);
			System.out.printf("Valor líquido sugerido para os produtos em estoque da classe E: R$ %.2f\n\n", precoSugerido2);

			System.out.printf("Quantidade em estoque da classe V: %d\n", qtd3);
			System.out.printf("Custo dos produtos em estoque da classe V: R$ %.2f\n", custo3);
			System.out.printf("Valor líquido sugerido para os produtos em estoque da classe V: R$ %.2f\n\n", precoSugerido3);

			System.out.printf("Quantidade total de produtos em estoque: %d\n", qtd1 + qtd2 + qtd3);
			System.out.printf("Custo total dos produtos em estoque: R$ %.2f\n", custo1 + custo2 + custo3);
			System.out.printf("Valor líquido total sugerido para os produtos em estoque: R$ %.2f\n\n", precoSugerido1+precoSugerido2+precoSugerido3);



			System.out.println("\n\nObrigado por utilizar nosso sistema - By Artico :)");

			sc.close();
		}

	}

}
