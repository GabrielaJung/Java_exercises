public class Gerente extends Funcionario{
    private String nivel;

    public Gerente(String nivel, String nome, String endereco, String sexo, String dt_contratacao){
        super(nome, endereco, sexo, dt_contratacao);
        this.nivel = nivel;
    }

    public String getNivel(){ return nivel; }
    public void setNivel(String nivel){ this.nivel = nivel; }

    public void exibeDados() {
		System.out.println(getNome() + " método abstrato implementado" );
	}
    
}
