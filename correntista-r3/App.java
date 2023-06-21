/* Nova Implementa��o de App*/

/*
3. Proponha um m�todo main que permita ao usu�rio criar uma conta e um correntista, 
exibindo, ao final, o nome do correntista, a identifica��o da conta e o saldo.
*/

import java.util.Scanner;

public class App {
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
        
		//vari�veis para leitura
		String nome, endereco;
		int numero;
		
		//leitura
		System.out.println("Informe o seu nome:");
		nome = read.nextLine();
		System.out.println("Informe o seu endereco:");
		endereco = read.nextLine();
		System.out.println("Informe o n�mero da conta:");
		numero = read.nextInt();
		
		// criando obj
		Conta conta1 = new Conta();
		conta1.setNumero(numero);
		Correntista corr1 =  new Correntista(nome,endereco);
		
		//associacao
		conta1.setCor(corr1); // setando funções do correntista corr1 para a conta 1
		corr1.setConta(conta1); // setando funções da conta 1 para o corr1
		
		
		// correntista
		System.out.println(corr1.getNome() + ", tem "+ corr1.getConta().getSaldo() + " reais" + " na conta: " + corr1.getConta().getNumero() + ".");
        
		// conta
		System.out.println(conta1.getCorr().getNome() + ", tem " + conta1.getSaldo() + " reais"  + " na conta: " + conta1.getNumero() + ".");
 }
}
