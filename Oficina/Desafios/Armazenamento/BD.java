/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armazenamento;
import Classes.Cliente;
import Classes.Veículo;
/**
 *
 * @author lucas
 */
public class BD {
    private static Cliente usuario[] = new Cliente[200]; //aqui fica tudo armazenado
    private static Veículo automoveis[] = new Veículo[200];
    
        public static void startBD(){
            try{
                usuario[0] = new Cliente("João","Alameda Delta", "319913983434");
                usuario[1] = new Cliente("Maria", "Rua Tocantins", "03194584534");
                usuario[2] = new Cliente("Douglas", "Rua Amazonas", "03195673435");
                usuario[3] = new Cliente("Ronaldo", "Rua Madri", "031935734635");
                usuario[4] = new Cliente("Guilherme", "Rua Goias", "0319834836665");
                }catch (Exception ex)  {          
                    System.out.println("Problema na base de dados. Tente novamente mais tarde!");
                }        
            //(String placa, String modelo, int ano, int chassi, String cor) {
            automoveis[0] = new Veículo("XCA-3943", "Corolla", 2012, 39439845, "vermelho", usuario[0]);
            
            //automoveis[1] = new Veículo(Golft GTI, 2015, CTR9325, hgsaduiasd223451sd, preto);
            //automoveis[2] = new Veículo(Fiat Uno, 2009, TRO8231, asdjbndfs23423asc, cinza);
           // automoveis[3] = new Veículo(Camaro, 2019, RTX3090, nvsi39493ukmsas, amarelo);
            //automoveis[4] = new Veículo(Peugeot, 2005, MAS3842, wpqoqweruer39432sdd, azul);

        }           
    public BD() {
    }
    public static Cliente[] getClientes(){
        return usuario;
    }
    public static Veículo[] getVeículo(){
        return automoveis;
    }
    private static boolean insertNewVec(Object vec[], Object novo ){ ///uma super classe
         for(int i = 0; i < vec.length; i++){
            if(vec[i] == null){
                vec[i] = novo;
                return true;
            }
        }
        return false;
    }
     public static boolean insertNewUserBD(Cliente novo){
         return insertNewVec(usuario, novo);
     }
     
     public static boolean insertNewVeiculoBD(Veículo novo){
         return insertNewVec(automoveis, novo);
     }
     
        
}
