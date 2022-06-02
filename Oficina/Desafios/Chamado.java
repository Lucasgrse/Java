/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author lucas
 */
public class Chamado {
    Scanner r = new Scanner(System.in);
    private String service;
    private String description;
    private String solicitação;
    private String numero;
    private Veículo informacoes[];

    public Chamado(String service, String description, String solicitação) {
        this.service = service;
        this.description = description;
        this.solicitação = solicitação;
    }
    public Chamado(String service, String numero){
        this.service = service;
        this.numero = numero;
        this.informacoes = new Veículo[10];
        startgeneration();
    }
    //irá gerar um número aleatório do chamado
    private void startgeneration(){
        Random gerar = new Random();
        this.numero = "" + (System.currentTimeMillis()/10) + "" + gerar.nextInt(40000)+200000;
        
    }
    public Veículo oldInfo(int indice){
        return this.informacoes[indice];
    }
    public void TrocaOil (Veículo novoOil){
        for (int i = 0; i < this.informacoes.length; i++){
            if(this.informacoes[i] == null){ //vai verificar se houve uma troca de oleo ou não
                this.informacoes[i] = novoOil;
                break;
            }
        }
    }    
    public void setService(String service){
        this.service = service;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getService(){
        return service;
    }
    public String getDescription(){
        return description;
    }
    public String getSolicitação(){
        return solicitação;
    }    
}
