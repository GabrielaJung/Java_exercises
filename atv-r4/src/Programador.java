public class Programador extends Funcionario {

	private String linguagemProg;
	
	public Programador(){}

	public Programador(
		String linguagemProg,
		
		int codFuncionario, 
		String nome, 
		String idade, 
		String salario
	){
		super(codFuncionario, nome, idade, salario);
		this.linguagemProg = linguagemProg;
	}

	public String getLinguagemProg() {return linguagemProg;}
	public void setLinguagemProg(String linguagemProg) {this.linguagemProg = linguagemProg;}
}
