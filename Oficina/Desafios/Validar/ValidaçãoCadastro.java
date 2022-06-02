/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validar;
import java.util.*; 
/**
 *
 * @author lucas
 */
public class ValidaçãoCadastro {
    public static String entradalogin(){
        Scanner in = new Scanner(System.in);
        String key;
        boolean infor = false;      
        do{
            if(infor){
                    System.out.println("Informação não preenchida!Por favor digite novamente.");
                }           
            key = in.nextLine();
            infor = true;
        }while(key.isEmpty());
        return key;
    }
    public static String entradaEndereço(){
        String end = entradalogin();
        
        //Se tiver usuarios com 
        while(end.length() < 3 || end.length() > 25){
            System.out.println("Quantidade de digítos não permitida! Informe com abrevio.");
            end = entradalogin();
       }
        return end;
    }
    public static String entradaNumero(){
          String num = entradalogin();
        
        //Se tiver usuarios com 
        while(num.length() < 3 || num.length() > 14){
            System.out.println("Quantidade de digítos não permitida! Informe com abrevio.");
            num = entradalogin();
       }
        return num;    
    }
    private static Double entradaAno(){
        Scanner in = new Scanner(System.in);
        Double entrada = null;
        
        try{
        entrada = in.nextDouble();
        }catch(Exception ex){
            System.out.print("Entrada inválida. Tente novamente: ");
        }
        return entrada;
    }
    
    public static Double entradaNumber(){
        Double number = entradaAno();
        
        while(number == null){
            number = entradaAno();
        }
        return number;       
    }
    public static String entradaPlaca(){
        String plc = entradalogin();
        //Placa XAS-2433 
        while(plc.length() != 8 || !plc.matches("[A-Z]{3}-[0-9]{4}")){
            System.out.println("Essa placa não está dentro do padrão definido. Por favor digite novamente!");
            plc = entradalogin();           ///FGH - 9030
        }
        return plc;
    }
}

  
                
        

    

