// SISTEMA DE GERENCIAMENTO DE PROJETOS //


/*D) Programar um método main, em uma classe criada apenas para contê-lo.
  O método main deve instanciar 2 projetos com seus respectivos gerentes de projetos, 
  sendo uma criada com os dados atribuídos em código 
  e uma com os dados inseridos informados pelo usuário por leitura do teclado.  */


// scanner
import java.util.Scanner;

public class App {

	// função principal
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
        
		//variáveis para leitura
		String nomeProjeto, nivel; //Projeto
		double custo, gerarCusto; //Projeto
		String nome; //Gerente

		// definindo valor inicial para a variável custo
		custo = 0;

		//criando obj projeto 1
		Projeto pjt1 =  new Projeto(); 

		//leitura
		System.out.println("Informe o nome do projeto:");
		nomeProjeto = read.nextLine();
		System.out.println("Informe o nível do projeto: \nO - Operacional \nE - Estratégico");
		nivel = read.nextLine();
		System.out.println("Informe o nome do gerente do projeto:");
		nome = read.nextLine();
		System.out.println("Informe o custo do projeto:");
		custo = read.nextDouble();
		System.out.println("\n");

		// validando o valor de custo
		pjt1.gerarCusto(custo, pjt1);

		pjt1.verificaNivel(nivel, pjt1);
		
		// inserindo dados no objeto pjt1
		pjt1.getNomeProjeto();
		pjt1.setNomeProjeto(nomeProjeto);

		// criando obj gerente 1
		Gerente grt1 = new Gerente(); 
		grt1.setNome(nome);	
		
		//associacao
		grt1.setPjt(pjt1); // setando funções do pjt1 para o grt1
		pjt1.setGrt(grt1); // setando funções do gerente1 para o pjt1

		// ---------- saídas
		// E) No método main, exibir os projetos criados, conforme o item D)
		// saída por meio de dados inseridos pelo usuário
		System.out.println(
			"Projeto: " + pjt1.getNomeProjeto() + " - "+ pjt1.getNivel() + "\n" + 
			"Custo: R$" + pjt1.getCusto() + "\n" + 
			"Gerente de projetos: " + grt1.getNome()
		);

		System.out.println("\n");
		
		// inserindo dados para o segundo projeto
		pjt1.getNomeProjeto();
		pjt1.setNomeProjeto("Segundo Projeto");

		// aqui é utilizada a função para verificar o nível
		pjt1.getNivel();
		pjt1.verificaNivel("E", pjt1);
		
		pjt1.getCusto();
		pjt1.setCusto(603.94);
		
		grt1.getNome();
		grt1.setNome("Segundo Gerente");

		// saída com dados inseridos diretamente pelo código
		System.out.println(
			"Projeto: " + pjt1.getNomeProjeto() + " - "+ pjt1.getNivel() + "\n" + 
			"Custo: R$" + pjt1.getCusto() + "\n" + 
			"Gerente de projetos: " + grt1.getNome()
		);
	}
}
