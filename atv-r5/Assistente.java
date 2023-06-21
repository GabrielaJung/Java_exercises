public class Assistente extends Funcionario{
    private String especializacao;

    public Assistente(String especializacao, String nome, String endereco, String sexo, String dt_contratacao){
        super(nome, endereco, sexo, dt_contratacao);
        this.especializacao = especializacao;
    }
    
    public String getEspecializacao(){ return especializacao; }
    public void setEspecializacao(String especializacao){ this.especializacao = especializacao; }

    // public void exibeDados() {
	// 	System.out.println(nome + " método abstrato implementado" );
	// }
}
