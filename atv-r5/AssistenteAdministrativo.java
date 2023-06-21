public class AssistenteAdministrativo extends Assistente {
    private String turno;

    public AssistenteAdministrativo(String turno, String especializacao, String nome, String endereco, String sexo, String dt_contratacao){
        super(especializacao, nome, endereco, sexo, dt_contratacao);
        this.turno = turno;
    }

    public String getTurno(){ return turno; }
    public void setTurno(String turno){this.turno = turno + ", turno adicional: noturno";}    

    public void exibeDados() {
		System.out.println(getNome() + " método abstrato implementado" );
	}
}
