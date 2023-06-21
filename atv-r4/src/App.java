import java.util.Scanner;


public class App {
	public static int ler = 1;
	public static int contador = 0;
	public static int inserir = 1;

	public static void main(String args[]){
		Scanner read = new Scanner(System.in);

		//variáveis para leitura
		String linguagemProg, nome, idade, salario;
		int codFuncionario;

		Funcionario FuncA = new Funcionario (
			1, 
			"Sanji", 
			"35", 
			"1400,00"
		);

		Programador progB = new Programador(
			"JavaScript", 
			2, 
			"Zoro", 
			"25", 
			"3000,00"
		);

		System.out.println("Testes: ");
		System.out.println("Funcionário A: " + FuncA.getNome());
		System.out.println("Programador B: " + progB.getNome());

		
		do{

			codFuncionario = 3;
			System.out.println("Deseja cadastrar: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Funcionário");
			System.out.println("2 - Programador");
			int ler = read.nextInt();
			

			if(ler == 1){
				Funcionario FB = new Funcionario();

				System.out.println("Digite o nome do funcionário:");
				FB.setNome(read.next());
				
				System.out.println("Digite a idade do funcionário:");
				FB.setIdade(read.next());
				
				System.out.println("Digite o salário do funcionário");
				FB.setSalario(read.next());

				System.out.println(
					"Funcionário " + 
					FB.getCodFuncionario() +
					", " + 
					FB.getNome() +
					" tem " +
					FB.getIdade() +
					" anos e recebe R$" +
					FB.getSalario() +
					" por mês."
				);
			} else if (ler == 2){
				Programador PC = new Programador();

				System.out.println("Digite o nome do programador:");
				PC.setNome(read.next());

				System.out.println("Digite a idade do programador");
				PC.setIdade(read.next());

				System.out.println("Digite o salário do programador");
				PC.setSalario(read.next());

				PC.setLinguagemProg("");
				
				System.out.println("Linguagens de programação utilizadas: (máximo 3)");
				while(contador < 3){
					System.out.println("Linguagem "+ (contador+1) +": ");
					linguagemProg = PC.getLinguagemProg() + ", " + read.next();
					
					
					contador = contador + 1;
					
					if(contador < 3){
						System.out.println("Deseja inserir mais uma linguagem? ");
						System.out.println("0 - Não");
						System.out.println("1 - Sim");
						inserir = read.nextInt();
					}
					if(inserir == 0) contador = 4;

					PC.setLinguagemProg(linguagemProg);
				}

				System.out.println(
					"Programador " + 
					PC.getCodFuncionario() +
					", " + 
					PC.getNome() +
					" tem " +
					PC.getIdade() +
					" anos e recebe R$" +
					PC.getSalario() +
					" por mês, trabalhando com a(s) linguagem(s) de programação: " +
					PC.getLinguagemProg() +
					"."
				);
			}
			codFuncionario = codFuncionario + 1;
		} while(ler != 0);
	}
	
}
