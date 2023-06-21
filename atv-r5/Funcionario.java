public abstract class Funcionario {
    private String nome;
    private String endereco;
    private String sexo;
    private String dt_contratacao;
    
    public Funcionario(String nome, String endereco, String sexo, String dt_contratacao){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dt_contratacao = dt_contratacao;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getSexo() { return sexo; }
    public String getDt_contratacao() { return dt_contratacao; }

    public void setNome(String nome){ this.nome = nome; }
    public void setEndereco(String endereco){ this.endereco = endereco; }
    public void setSexo(String sexo){ this.sexo = sexo; }
    public void setDt_contratacao(String dt_contratacao){ this.dt_contratacao = dt_contratacao; }

}
