/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class vectorPositivo {

    public static void main(String[] args) {

        String x;
        int y;
        int a[] = new int[100];          
        for (int i = 0; i < a.length; i++) {
            x = JOptionPane.showInputDialog(null, "Digite um número: " + (i + 1));
            a[i] = Integer.parseInt(x);
            y = Integer.parseInt(x);
            if( y > 0){
               System.out.println(x);
            }else{
                JOptionPane.showMessageDialog(null, "Programa finalizado!");
                break;
            }
            
        }
        for (int i = 0; i < a.length; i++) {
            double T;
            x = JOptionPane.showInputDialog(null, "Digite um número: " + (i + 1));
            a[i] = Integer.parseInt(x);
            T = Integer.parseInt(x);
            System.out.println("Numero digitado: "+x);
        }
    }
}

