package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author lucas
 */
public class Veículo {
    Scanner in = new Scanner(System.in);
    private String placa;
    private String modelo;
    private int ano;        
    private int chassi;
    private String cor;
    private Cliente dono;

    public Veículo(String placa, String modelo, int ano, int chassi, String cor, Cliente dono) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
        this.cor = cor;
        this.dono = dono;
    }
    public Veículo(String placa, String modelo, int ano, int chassi, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
        this.cor = cor;
    }
    public Veículo(String placa, String modelo, int chassi) {
        this.placa = placa;
        this.modelo = modelo;
        this.chassi = chassi;
    }   
    public Veículo(String placa){
        this.placa = placa;
    }

    public Veículo(String modelo, double ano, String placa, double chassi, String cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getChassi() {
        return chassi;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    @Override
    public String toString(){
     return "placa" + this.placa + "\n" + "modelo" + this.modelo + "\n" + "ano" + this.ano + "\n" + "chassi" + this.chassi + "\n" + "cor" + this.cor + "\n";  
    }
}

    
