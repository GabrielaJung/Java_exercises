/*
Base: Solu��o exerc�cio Roteiro 2
*/

public class Conta {
       private int numero;
       private double saldo;
       //2. Implemente a associa��o entre as duas classes.
       private Correntista corr;
       //-------------------------------------------------
       
       public Conta(){    
       }
       
       public int getNumero() {
             return numero;
       }
       
       public void setNumero(int numero) {
             this.numero = numero;
       }
       
       public double getSaldo() {
             return saldo;
       }
       
       //m�todo retirar
       public void retirar(double valor) {
    	   if (saldo>=valor) {
    		   saldo = saldo - valor;
    	   }else System.out.printf("Valor indispon�vel!\n");
       }
       
       public void depositar(double valor){
             saldo = saldo + valor;
       }
       
       public void transferir(double valor, Conta destino){
             if(saldo>=valor){
                    saldo = saldo - valor;
                    destino.depositar(valor);
             }else System.out.printf("Valor indispon�vel!\n");
       }
       
       //2. Implemente a associa��o entre as duas classes.
       //m�todos get e set inseridos ap�s a associa��o com Correntista
       public Correntista getCorr() {
   			return corr;
   	   }

   	   public void setCor(Correntista corr) {
   		   	this.corr = corr;
   	   }
       //-------------------------------------------------
       
}
