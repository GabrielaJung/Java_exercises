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
		
		//Cria��o dos objetos
		Conta conta1 = new Conta();
		conta1.setNumero(numero);
		Correntista corr1 =  new Correntista(nome,endereco);
		
		//Associando os objetos
		conta1.setCor(corr1); //agora, a conta c1 pode pedir servi�os (acionar m�todos) de correntista
		corr1.setC(conta1); // agora, o correntista cor 1 pode pedir servi�os (acionar m�todos) de conta
		
		//Exibi��o: alternativa que parte da conta
		System.out.println(conta1.getCorr().getNome() + " na conta: " + conta1.getNumero() + " tem "+ conta1.getSaldo() + " reais.");
		
		//Exibi��o: alternativa que parte do correntista
		System.out.println(corr1.getNome() + " na conta: " + corr1.getConta().getNumero() + " tem "+ corr1.getConta().getSaldo() + " reais.");
        
 }
}
