public class App {
	public static void main (String args[]) {

		Computador A =  new Computador(1.9, "cinza", "dell", "dell.com", "brasil", "intel core i7", 16);
		A.exibeTipo();
		System.out.println();
		A.recebeValor(5670.59);
		System.out.println("Valor de hardware: " + A.getValor());
		A.recebeValor(5670.59, 8);
		System.out.println("Valor de computador: " + A.getValor());
	}
}
