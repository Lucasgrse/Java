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
public class TrainingSwitch {

    //exercicio 3 de Switch
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Início do Programa");
        String opcaoDigitado = null;
        int opcao;
        int lado1, lado2, lado3, raio;
        double area;
        double perimetro;
        do {
            System.out.println("\n-=- Menu de opções -=- ");
            System.out.println("\n-=- Perímetro do círculo..............[1]");
            System.out.println("\n-=- Perímetro do retângulo...........[2]");
            System.out.println("\n-=- Perímetro do triângulo............[3]");
            System.out.println("\n-=- Sair..............................[4]");
            System.out.println("\n\n\n-=- Digite sua opção: ");
            opcaoDigitado = JOptionPane.showInputDialog(""
                    + "\n-=- Perímetro do círculo..............[1]"
                    + "\n-=- Perímetro do retângulo............[2]"
                    + "\n-=- Perímetro do triângulo............[3]"
                    + "\n-=- Sair..............................[4]"
                    + "\n"
                    + "\n"
                    + "\n-=- Digite sua opção:");
            opcao = Integer.parseInt(opcaoDigitado);
            switch (opcao) {
                case 1: {
                    opcaoDigitado = JOptionPane.showInputDialog("Digite o raio do círculo:");
                    raio = Integer.parseInt(opcaoDigitado);
                    area = 2 * Math.PI * raio;
                    JOptionPane.showMessageDialog(null, "Área do círculo igual a : " + area);
                    break;
                }
                case 2: {
                    System.out.println("\nCalcular perímetro do retângulo! ");
                    // Solicitar ao usuários o lado1 e lado2
                    opcaoDigitado = JOptionPane.showInputDialog("Digite os lados do retângulo: ");
                    lado1 = Integer.parseInt(opcaoDigitado);
                    lado2 = Integer.parseInt(opcaoDigitado);
                    perimetro = 2 * (lado1 + lado2);
                    JOptionPane.showMessageDialog(null, "O perímetor do retângulo é: " + perimetro);
                    break;
                }
                case 3: {
                    System.out.println("\nCalcular perímetro do triângulo! ");
                    // Solicitar ao usuários o lado1, , lado2 e lado3
                    opcaoDigitado = JOptionPane.showInputDialog("Digite os lados do triangulo: ");
                    lado1 = Integer.parseInt(opcaoDigitado);
                    lado2 = Integer.parseInt(opcaoDigitado);
                    lado3 = Integer.parseInt(opcaoDigitado);
                    perimetro = lado1 + lado2 + lado3;
                    JOptionPane.showMessageDialog(null, "O perímetor do triangulo é: " + perimetro);
                    break;
                }
                case 4: {
                    System.out.println("\nSair! ");
                    break;
                }
                default: {
                    System.out.println("\nOpção inválida. Valores válidos 1, 2, 3 ou 4! ");
                    break;
                }
            }
        } while (opcao != 4);
        JOptionPane.showMessageDialog(null, "Fim do Programa");
    }
}
