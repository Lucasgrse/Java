package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Armazenamento.BD;
import cadastro.ControladorCliente;
import cadastro.ControladorVeiculo;
import java.util.*;
/**
 *
 * @author lucas
 */
public class Oficina {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {    
        BD.startBD(); //cadastro de clientes
         
         ControladorCliente cont = new ControladorCliente();       
        cont.cadastroCliente();
        Cliente select = cont.foundNome();
        System.out.println(select.toString());
        
        ControladorVeiculo contr = new ControladorVeiculo();      
        //Veículo busca = contr.foundVeiculo(null);
        //System.out.println(busca.toString());
        
     
    }   
}
