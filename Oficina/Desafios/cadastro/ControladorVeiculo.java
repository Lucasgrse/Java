/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import Armazenamento.BD;
import Classes.Veículo;
import Validar.ValidaçãoCadastro;

/**
 *
 * @author lucas
 */
public class ControladorVeiculo {
    
    public boolean cadastroVeiculo(){
        System.out.println("Informe o modelo de seu veículo: ");
        String modelo = ValidaçãoCadastro.entradalogin();
        
        System.out.println("Qual o ano de seu veículo: ");
        double ano = ValidaçãoCadastro.entradaNumber();
        
        System.out.println("Informe a placa do seu veículo: ");
        String placa = ValidaçãoCadastro.entradaPlaca();
        
        System.out.println("Informe o numero do seu chassi: ");
        double chassi = ValidaçãoCadastro.entradaNumber();
        
        System.out.println("Informe a cor do seu veículo: ");
        String cor = ValidaçãoCadastro.entradalogin();
        
        Veículo novoVeiculo = new Veículo(modelo, ano, placa, chassi, cor);
        
        return BD.insertNewVeiculoBD(novoVeiculo);       
    }
    
    public Veículo foundVeiculo(String placa){
        
        if(placa == null){
            System.out.println("Informe a placa para realizar verificar a situação do seu veículo");
            placa = ValidaçãoCadastro.entradaPlaca();
        }
        Veículo allVeículos[] = BD.getVeículo();
        
        for(int i = 0; i < allVeículos.length; i++){
            if(allVeículos[i] != null){
            if(allVeículos[i].getPlaca().equalsIgnoreCase(placa)){
            return allVeículos[i];
           }
        }else{
                return null;
                }
        }
        return null;
    }
    public Veículo emitirOrçamento(Veículo orcament){
        if(orcament == null){
            orcament = foundVeiculo(null); //sera achado o veiculo
        }
        return orcament;
    }
   
  
}
