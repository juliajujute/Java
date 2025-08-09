/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatest;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIA_5005
 */
public class ContaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta fabio = new Conta();
        Conta cleiton= new Conta();
                
                
        // a classe Double.parseDouble converte o valor que vem da caixa de texto para double, pois o que vem da caixa de texto é texto
        fabio.cliente = JOptionPane.showInputDialog("Nome do cliente: ");
        fabio.saldo = Double.parseDouble( JOptionPane.showInputDialog("Informe o valor do saldo: " ));
       
        cleiton.cliente = JOptionPane.showInputDialog("Nome do cliente: ");
        
        fabio.transferir(cleiton, 200);
    }
        
        
    
}
