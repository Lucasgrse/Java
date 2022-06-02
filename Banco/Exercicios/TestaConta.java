/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author laura
 */
public class TestaConta {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente(2, "Lucas", 200000);
        Conta ca = new ContaPoupança(5, "Laura", 300);
        cc.imprimirDadosConta();
        ca.imprimirDadosConta();
        cc.transferir(ca, 5000);
        ca.imprimirDadosConta();
        


        /*System.out.println("Acesso ao banco liberado!");
        Conta c1 = new Conta(2, "Ricardo", 2000);
        Conta c2 = new Conta(3, "Cristiano", 25343);
        System.out.println("\n");
        c1.inicializar();
        c2.inicializar();
        c1.imprimirDadosConta();
        c2.imprimirDadosConta();
        c1.debitar();
        c1.transferir(c2, 200);*/
        
        
        //System.out.println("Acesso ao banco liberado!");
       // Conta cc = new ContaCorrente(3, "Cristiano", 25343);
        //System.out.println("\n");
        //cc.inicializar();
        //cc.imprimirDadosConta();
        //cc.debitar();

        //System.out.println("Acesso ao banco liberado!");
       // Conta c4 = new Conta(4, "Ronaldo", 53);
       // System.out.println("\n");
        //c4.inicializar();
       // c4.imprimirDadosConta();
       // c4.debitar();

       // System.out.println("Acesso ao banco liberado!");
       // Conta c5 = new Conta(5, "Lucas", 100000);
        //System.out.println("\n");
       // c5.inicializar();
        //c5.imprimirDadosConta();
        //c5.debitar();
               
        
        
    }
    
}








