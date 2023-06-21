
public abstract class Fabricante {
	private String nome;
	private String site;
	private String pais;
	
	public Fabricante(String nome, String site, String pais) {
		this.nome = nome;
		this.site = site;
		this.pais = pais;
	}

	public String getNome() { return nome;}
	public String getSite() {return site;}
	public String getPais() {return pais;}

	public void setNome(String nome) {this.nome = nome;}
	public void setSite(String site) {this.site = site;}
	public void setPais(String pais) {this.pais = pais;}
}
