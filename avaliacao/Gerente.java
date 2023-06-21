/*B) Programar uma classe Gerente.java,
  a qual é a abstração do conceito de gerente de projetos, 
  a qual possui o atributo nome. */

public class Gerente {
      private String nome;
      private Projeto pjt;

      // constructors
      public Gerente() { }

      // get / set
      public String getNome() { return nome; }
      public void setNome(String nome) { this.nome = nome;}

      // funções

      // get / set --> fazendo ref ao pjt
      // C) Programar a associação entre as classes Projeto.java (item A) e Gerente.java (item B).
      public Projeto getPjt() { return pjt; }
      public void setPjt(Projeto pjt) { this.pjt = pjt; }
}
