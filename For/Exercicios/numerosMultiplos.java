
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class numerosMultiplos {

    public static void main(String[] args) {
        int x;
        String numx;
        int num;

        JOptionPane.showMessageDialog(null, "Bem vindo ao programa!");
        numx = JOptionPane.showInputDialog("Por favor digite um numero: ");
        num = Integer.parseInt(numx);

        for (x = 0; x < 501; x++) {
            System.out.print("Numero:" + x);
            if (num < 10 && num > 0) {
                if (x % num == 0) {
                    System.out.print(" múltiplo");
                } else {
                    System.out.print(" não é multiplo!");
                }
                System.out.println("");
            } else {
                JOptionPane.showMessageDialog(null, "Entrada inválida");
                break;
            }
        }
    }
}
