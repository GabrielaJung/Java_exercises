
public class Hardware extends Fabricante{
	private double peso; 
	private String caracteristicas;
	protected double valor;
	
	public Hardware(double peso, String caracteristicas, String nome, String site, String pais) {
		super(nome, site, pais);
		this.caracteristicas = caracteristicas;
		this.peso = peso;
	}

	
	public double getPeso() {return peso;}
	public String getCaracteristicas() {return caracteristicas;}
	public double getValor() {return valor;}

	public void setPeso(double peso) {this.peso = peso;}
	public void setCaracteristicas(String caracteristicas){this.caracteristicas = caracteristicas;}
	
	//polimorfismo:
	public void recebeValor(double valor) {this.valor = valor + (100*peso);}
	
	public void exibeTipo() {
		System.out.println("Equipamento: Hardware");
		System.out.println("Peso: " + peso);
	} 
	
}
