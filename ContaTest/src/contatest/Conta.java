
package contatest;

import javax.swing.JOptionPane;

public class Conta {
 //atributos
    public double saldo;
    public String cliente;
    
    public void sacar(double valor){
        
    //saldo = saldo - valor;
    saldo -= valor;
            
        JOptionPane.showMessageDialog(null, cliente + " Operação de saque no valor de R$:" +valor);
            
  }
      public void depositar (double valor){
        
    //saldo = saldo + valor;
    saldo += valor;
         JOptionPane.showMessageDialog(null, cliente + " Operação de saque no valor de R$:" +valor);
            
  }
      public void exibirSaldo(){
         
          JOptionPane.showMessageDialog(null, cliente + ", seu saldo é R$" + saldo);
      }
      
    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        
        
        
    }  
}
