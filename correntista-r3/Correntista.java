/*
1. Crie uma classe Correntista, propondo atributos e m�todos adequados ao contexto do problema. 
*/

public class Correntista {
	private String nome;
	private String endereco;
	//2. Implemente a associa��o entre as duas classes.
    private Conta conta;
    //-------------------------------------------------
	
	
	//Construtores
	public Correntista() {
		
	}
	
	public Correntista(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Correntista(String nome) {
		this.nome = nome;
	}

	//M�todos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//2. Implemente a associa��o entre as duas classes.
    //m�todos get e set inseridos ap�s a associa��o com Correntista
    public Conta getConta() {
			return conta;
	   }

	   public void setC(Conta conta) {
		   	this.conta = conta;
	   }
    //-------------------------------------------------
}
