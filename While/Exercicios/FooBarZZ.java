/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author lucas
 */
public class FooBarZZ {

    //while
    public static void main(String[] args) {
        int i = 0;
        int x;
        int contador = 0;

        while (i <= 49) {
            i++;
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print(" foo");
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
