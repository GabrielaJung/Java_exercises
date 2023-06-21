public class Funcionario {
	private int codFuncionario;
	private String nome;
	private String idade;
	private String salario;

	public Funcionario(){}
	
	public Funcionario(int codFuncionario, String nome, String idade, String salario){
		this.codFuncionario = codFuncionario;
		this.nome = nome;
		this.idade =  idade;
		this.salario = salario;
	}

	public int getCodFuncionario(){return codFuncionario;}
	public void setCodFuncionario(int codFuncionario){this.codFuncionario = codFuncionario;}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public String getIdade() {return idade;}
	public void setIdade(String idade) {this.idade = idade;}

	public String getSalario(){return salario;}
	public void setSalario(String salario){this.salario = salario;}
}
