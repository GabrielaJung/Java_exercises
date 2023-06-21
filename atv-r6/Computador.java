
public class Computador extends Hardware{
	private String processador;
	private int memoria;
	
	public Computador(double peso, String caracteristicas, String nome, String site, String pais, String processador, int memoria) {
		super(peso, caracteristicas, nome, site, pais);
		this.processador = processador;
		this.memoria = memoria;
	}

	public String getProcessador() {return processador;}
	public int getMemoria() {return memoria;}

	public void setProcessador(String processador) {this.processador = processador;}
	public void setMemoria(int memoria) {this.memoria = memoria;}
	
	//sobrecarga
	public void recebeValor(double valor, int memoria) {this.valor = valor + (100*getPeso()) + (150 * memoria);}
	
	//sobreposicao
	public void exibeTipo() {
		System.out.println("Equipamento: Computador");
		System.out.println("Processador: " + processador);
		System.out.println("Memória: " + memoria);
		System.out.println("Peso: " + getPeso());
	}
	
}
