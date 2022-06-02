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
    private String modelo, ano;
    private int chassi;
    private String cor;

    public Veículo(String placa, String modelo, String ano, int chassi, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
        this.cor = cor;
    }
    
    public Veículo(String placa){
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
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

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
}

    
