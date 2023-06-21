public class AssistenteTecnico extends Assistente {
    private String bonus_sal;

    public AssistenteTecnico(String bonus_sal, String especializacao, String nome, String endereco, String sexo, String dt_contratacao){
        super(especializacao, nome, endereco, sexo, dt_contratacao);
        this.bonus_sal = bonus_sal;
    }

    public String getBonus_sal(){ return bonus_sal; }
    public void setBonus_sal(String bonus_sal){this.bonus_sal = bonus_sal;}    

    public void exibeDados() {
		System.out.println(getNome() + " método abstrato implementado" );
	}
}
