/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Conta{
    private int numero;
    private String titular;
    protected double saldo;
    private double valor;
    private int txt;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void inicializar(){
        System.out.println("Bem vindo Senhor: "+titular);
    }
    public boolean debitar(double valor) {     
        if (valor < saldo) {
            saldo = saldo - valor;
            System.out.println("Operação realizada com sucesso! Saldo atual: R$"+saldo);
            return true;         
        }else {    
            return false;
        }
    }
    public void imprimirDadosConta(){      
        System.out.println("Atualmente o numero da conta é: "+numero+ "." +"\n" + "O titular é: "+titular + "." + "\n" + "Seu saldo disponível é: R$"+saldo + "\n");
        
    }
    public boolean transferir(Conta contaDestino, double valor) {
        Scanner in = new Scanner(System.in);
        System.out.println("Para qual conta você irá transferir?");
        txt = in.nextInt();
        System.out.println("Qual valor?");
        valor = in.nextDouble();
        if (valor <= saldo) {
            this.debitar(valor);
            contaDestino.creditar(valor);
            return true;
            } else {
                System.out.println("Você não possui saldo suficiente para essa transação!");
                return false;
            }
    }
    public boolean creditar(double valor){
        this.valor = valor;
        saldo = saldo + valor;
        System.out.println("Déposito recebido de "+valor + ". Saldo atual: "+saldo);
      return true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = (int) valor;
    }
    



    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
}
