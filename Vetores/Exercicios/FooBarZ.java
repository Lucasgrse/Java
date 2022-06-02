/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author lucas
 */
public class FooBarZ {
//nesse projeto, pegamos, quando cada número é dividido por 3, ou por 5, ou por 7, recebe uma frase na frente
    public static void main(String[] args) {
        int vetor[] = new int[51];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
            System.out.print(vetor[i]);
            if (i % 3 == 0) {
                System.out.print(" Foo");
            }
            if (i % 5 == 0) {
                System.out.print(" bar");
            }
            if (i % 7 == 0) {
                System.out.print(" baz");
            }
            System.out.println(" ");
        }
    }
}
