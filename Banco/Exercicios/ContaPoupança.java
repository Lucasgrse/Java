/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ContaPoupança extends Conta {

    private int numero;
    private String titular;
    protected double saldo1;
    private double rendimentos;
    private double valor1;

    public ContaPoupança(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public boolean debitoPoupança(double valor1) { //esse aqui é o saque
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a ser débitado de sua conta Poupança: ");
        valor1 = in.nextInt();
        if (valor1 < saldo) {
            this.saldo -= valor1;
            System.out.println("Operação realizada com sucesso. Saldo atual: R$" + saldo);
            return true;
        } else {
            return false;
        }
    }
    public boolean creditoPoupança(double valor1){ //esse aqui é o deposito na conta
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar em sua conta Poupança: ");
        valor1 = in.nextInt();
        if(valor1 < saldo && valor1 == saldo || valor1 > saldo && valor1 != saldo){
            this.saldo += valor1;
            System.out.println("Operação realizada com sucesso! Saldo atual: R$"+saldo);
            return true;
        }else {
            System.out.println("Houve um problema no deposito em sua conta! O valor será extornado.");
            return false;
        }    
    }
    public void redimentosPoupança(double rendimentos, double saldo1){
        double juros = 6.17;
        rendimentos = (saldo1 * juros/100);
        this.saldo1 = saldo1;
        System.out.println("Sua conta está rendendo: R$"+saldo1);
                
    }    
    public void imprimirDadosContaPoupança(Conta c){
        System.out.println("As informações da sua conta: "+numero + "\n" + "." + saldo + "\n" + "." + titular + "\n" + ".");    
    }
    public void imprimirDadosRendimentoPoup(double rendimentos){
        System.out.println("Rendimento atual da sua conta é de : R$"+rendimentos + "ao ANO.");
       
    }
    
   // public boolean transferirSaldo(Conta contaDestino, double valor1){
        
   // }
    
    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public double getRendimentos() {
        return rendimentos;
    }
    
}
