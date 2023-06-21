
//A) Programar uma classe Projeto.java, a qual é a abstração do conceito de projeto, 
// contendo os seguintes atributos: nome, nivel (operacional ou estratégico) e custo. 
// O sistema não deve aceitar valores menores ou iguais a zero para o atributo custo.
public class Projeto {
	private String nomeProjeto;
	private String nivel;
	private double custo;
    private Gerente grt;
	
	// constructors
	public Projeto() {}
	
	public Projeto(String nomeProjeto, String nivel, double custo) {
		this.nomeProjeto = nomeProjeto;
		this.nivel = nivel;
		this.custo = custo;
	}

	// get / set
	public String getNomeProjeto() { return nomeProjeto; }
	public void setNomeProjeto(String nomeProjeto) { this.nomeProjeto = nomeProjeto; }

	public String getNivel() { return nivel; }
	public void setNivel(String nivel) { this.nivel = nivel; }

	public double getCusto() { return custo; }
	public void setCusto(double custo) { this.custo = custo; }

	public void gerarCusto(double valor, Projeto receptor){
		if(valor <= 0){ 
			System.out.printf("Valor inválido!\n");
		} else receptor.custo = receptor.custo + valor; 
	}
	
	public void verificaNivel(String nivel, Projeto Owner){

		// esta função verifica qual nível o usuário digitou: O - Operacional, ou E - estratégico
		if (nivel.contains("O") || nivel.contains("o")){ setNivel("Operacional");

		} else if (nivel.contains("E") || nivel.contains("e")){ setNivel("Estratégico");

		} else {
			//se o nível for inválido, ele retorna o nível padrão (operacional)
			System.out.printf("Nível inválido!\n");
			setNivel("Operacional");
		}
	}
	
	// get / set com implementação ao grt
	// C) Programar a associação entre as classes Projeto.java (item A) e Gerente.java (item B).
    public Gerente getGrt() { return grt; }
	public void setGrt(Gerente grt) { this.grt = grt; }
}
