public class App {

    public static void main(String args[]){
        AssistenteAdministrativo A = new AssistenteAdministrativo("manhã + turno adicional noturno", "Administração", "Alberto", "R. Montanha", "masculino", "21/05/1996");
        AssistenteTecnico B = new AssistenteTecnico("R$ 230,00", "Técnico", "Bruno", "R. Bronze", "masculino", "01/02/2018");
        Gerente C = new Gerente("Estratécico", "Carolina", "R. Carolinas", "feminino", "05/09/2000");
        
        A.exibeDados();
        B.exibeDados();
        C.exibeDados();

        System.out.println(A.getNome()+", turno: "+A.getTurno());
        System.out.println(B.getNome()+", bônus salarial: "+B.getBonus_sal());
        System.out.println(C.getNome()+", nível: "+ C.getNivel());
    }
}
