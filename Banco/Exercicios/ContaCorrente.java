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
public class ContaCorrente extends Conta {
    private int numero2;
    private String titular;
    protected double saldo2;
    private double contaEspecial;
    private double limiteCheque;
    protected double saldoAvalaible;
    private double valor2;
    
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    public void SaldoAvailable(double saldo2){
        System.out.println("Bem vindo senhor "+titular);
        limiteCheque = (saldo * 35/100) *1.5;
        saldoAvalaible = limiteCheque + saldo2;
        System.out.println("O valor disponível na sua é de "+limiteCheque);
        if(limiteCheque < 0){
            System.out.println("Não há cheque especial disponível!");
        }
    }
    public void saldo(double saldo2){
        System.out.println("Saldo disponível: "+saldo2);
    }
    public void limiteCheque(double limiteCheque) {
        Scanner in = new Scanner(System.in);
        limiteCheque = (saldo2 * 35 / 100) * 1.5;
        System.out.println("Limite disponível :" + limiteCheque);
        System.out.println("\n");
        System.out.println("Deseja utlizar o limite? [s/n]");
        String answer = in.nextLine();
        if (answer.equals("s")) {
            System.out.println("Opções disponíveis: "
                    + "300" + ","
                    + "400" + ","
                    + "500" + ","
                    + "1000" + ","
                    + "5000.");
            double limit1 = 300;
            double limit2 = 400;
            double limit3 = 500;
            double limit4 = 1000;
            double limit5 = 5000;

            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n Limite R$" + limit1 + " escolhido.");
                    saldo2 = saldo + limit2 - (limiteCheque - limit2);
                    System.out.println("Saldo disponível: " + saldo2);
                    break;
                case 2:
                    System.out.println("\n Limite R$" + limit1 + " escolhido.");
                    saldo2 = saldo + limit2 - (limiteCheque - limit2);
                    System.out.println("Saldo disponível: " + saldo2);
                    break;
                case 3:
                    System.out.println("\n Limite R$" + limit1 + " escolhido.");
                    saldo2 = saldo + limit3 - (limiteCheque - limit3);
                    System.out.println("Saldo disponível: " + saldo2);
                    break;
                case 4:
                    System.out.println("\n Limite R$" + limit1 + " escolhido.");
                    saldo2 = saldo + limit4 - (limiteCheque - limit4);
                    System.out.println("Saldo disponível: " + saldo2);
                    break;
                case 5:
                    System.out.println("\n Limite R$" + limit1 + " escolhido.");
                    saldo2 = saldo + limit5 - (limiteCheque - limit5);
                    System.out.println("Saldo disponível: " + saldo2);
                    break;

            }

        }else{
            in.nextLine();
        }
    }
    public boolean debitoCorrente(double valor2) { //esse aqui é o saque
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a ser débitado de sua conta Poupança: ");
        valor2 = in.nextInt();
        if (valor2 < saldo) {
            this.saldo -= valor2;
            System.out.println("Operação realizada com sucesso. Saldo atual: R$" + saldo);
            return true;
        } else {
            return false;
        }
    }
    public boolean creditoPoupança(double valor2) { //esse aqui é o deposito na conta
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar em sua conta Poupança: ");
        valor2 = in.nextInt();
        if (valor2 < saldo && valor2 == saldo || valor2 > saldo && valor2 != saldo) {
            this.saldo += valor2;
            System.out.println("Operação realizada com sucesso! Saldo atual: R$" + saldo);
            return true;
        } else {
            System.out.println("Houve um problema no deposito em sua conta! O valor será extornado.");
            return false;
        }
    }
    public void imprimirDadosContaPoupança(Conta c){
        System.out.println("As informações da sua conta: "+numero2 + "\n" + "." + saldo2 + "\n" + "." + titular + "\n" + ".");    
    }

    public double getSaldo2() {
        return saldo2;
    }

    public double getSaldoAvalaible() {
        return saldoAvalaible;
    }
    
    
    
}
