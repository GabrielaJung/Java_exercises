public class Conta {
       private int numero;
       private double saldo;
       private Correntista corr;

      //  constructors
       public Conta(){    
       }
       
       // get / set
       public int getNumero() {
             return numero;
       }
       
       public void setNumero(int numero) {
             this.numero = numero;
       }
       
       public double getSaldo() {
             return saldo;
       }
       
       //funções
       public void gastar(double valor) {
    	   if (saldo>=valor) {
    		   saldo = saldo - valor;
    	   }else System.out.printf("Valor indispon�vel!\n");
       }
       
       public void depositar(double valor){
             saldo = saldo + valor;
       }
       
       public void transferir(double valor, Conta receptora){
             if(saldo>=valor){
                    saldo = saldo - valor;
                    receptora.depositar(valor);
             }else System.out.printf("Valor indispon�vel!\n");
       }
       

       // get / set --> fazendo ref ao correntista
       public Correntista getCorr() {
   			return corr;
   	   }

   	   public void setCor(Correntista corr) {
   		   	this.corr = corr;
   	   }
}
