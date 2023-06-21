public class Correntista {
	private String nome;
	private String endereco;
    private Conta conta;
	
	
	// constructors
	public Correntista() {
		
	}
	
	public Correntista(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	// get / set
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
	
	// get / set com implementação à conta
    public Conta getConta() {
			return conta;
	   }

	   public void setConta(Conta conta) {
		   	this.conta = conta;
	   }
}
