/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import Armazenamento.BD;
import Validar.ValidaçãoCadastro;
import java.util.Random;
import java.util.Scanner;
import Classes.Cliente;
import Armazenamento.BD;
/**
 *
 * @author lucas
 */
// aqui ocorre a checagem
public class ControladorCliente {
    private Scanner key;
    private Random gene;
    
    public ControladorCliente(){
        key = new Scanner(System.in);
        gene = new Random();
    }
    public boolean cadastroCliente(){    
    //String nome, endereço, numeroCelular
        System.out.println("Digite o seu nome:"); 
        String nome = ValidaçãoCadastro.entradalogin();       /// sempre vou repassando 
        System.out.println("Digite o seu endereço:");
        String endereco = ValidaçãoCadastro.entradaEndereço();
        System.out.println("Digite o seu (DDD)+nºde celular:");
        String numeroCelular = ValidaçãoCadastro.entradaNumero();
        
        Cliente novoUser = new Cliente(nome, endereco, numeroCelular);
        
        return BD.insertNewUserBD(novoUser);
    }  
    public Cliente foundNome(){
        System.out.print("Informe o nome do usuário para ser pesquisado.");
        String nome = ValidaçãoCadastro.entradalogin();
        //recupera
        Cliente usuarios[] = BD.getClientes();
        
        for(int i = 0; i < usuarios.length; i++){
            if (usuarios[i] == null ){ //nao existe condutes aqui
                return null;
            }
            if(nome.equalsIgnoreCase(usuarios[i].getNome()));
            return usuarios[i];
        }
        return null;
    }   
}


