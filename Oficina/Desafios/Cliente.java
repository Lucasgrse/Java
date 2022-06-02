/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author lucas
 */
public class Cliente {
    private String endereço;
    private String nome;
    private String numeroCelular;
    private String email;
    private String dataNascimento;


//todas as informações necessárias do cliente
    public Cliente(String endereço, String nome, String numeroCelular, String email, String dataNascimento) {
        this.endereço = endereço;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String endereço, String nome, String numeroCelular) {
        this.endereço = endereço;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void status(){
        System.out.println(this.nome);
    }    
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    public void setCelular(String numeroCelular){
        this.numeroCelular = numeroCelular;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
}

    
        

    
    
    

