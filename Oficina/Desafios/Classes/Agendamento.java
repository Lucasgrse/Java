package Classes;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.util.*;
/**
 *
 * @author lucas
 */
public class Agendamento {
    Scanner input = new Scanner(System.in);
    private boolean confirmação;
    public String avaliação;
    private String servicoID;
    private int numeroPedido;
    private boolean pago;
    private int valor;
    int opcional;

    public Agendamento(boolean confirmação, String avaliação, String servicoID) {
        this.confirmação = confirmação;
        this.avaliação = avaliação;
        this.servicoID = servicoID;
    }

    public Agendamento(boolean confirmação, String servicoID, int numeroPedido, boolean pago, int valor) {
        this.confirmação = true;
        this.servicoID = servicoID;
        this.numeroPedido = numeroPedido;
        this.pago = false;
        this.valor = valor;
        
        startNextLine();
    }
    private void startNextLine(){
        System.out.println("Escolha a seguir o melhor dia para levar o seu veículo :):");
        switch(this.servicoID){
            case "1":
                System.out.println("Agende daqui 1 dia às 15:00");                               
            break;
            case "Agende daqui 2 dias às 14:00":{
                
            }break;
            case "Agende daqui 3 dias às 09:00":{
            
            }break;
            case "Dia e horário desejado":{
                opcional = input.nextInt();
                System.out.println("Analisaremos a sua solicitação e você será notificado");
            }break;   
            }
        System.out.println("Agradecemos a preferência!");
    }
    public void setConfirmação(boolean confirmação){      
        this.confirmação = confirmação;
    }
    public void setAvaliação(String avaliação){
        this.avaliação = avaliação;
    }
    public void setServiçoID(String serviçoID){
        this.servicoID = servicoID;
    }
    public String getAvaliação(){
        return avaliação;
    }
    public String getServiçoID(){
        return servicoID;
    }   
}
