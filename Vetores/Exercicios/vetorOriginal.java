/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class vetorOriginal {

    public static void main(String[] args) {
        String x;
        int y;
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            x = JOptionPane.showInputDialog(null, "Digite um número: " + (i + 1));
            a[i] = Integer.parseInt(x);
            y = Integer.parseInt(x);
            System.out.println(x);
        }
        System.out.println("Vetor invertido!!!");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.println(j + 1);
        }

    }
}
