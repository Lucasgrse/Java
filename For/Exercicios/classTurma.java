/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author laura
 */
public class classTurma {
    public static void main(String[] args) {
        String id;
        int x = 0;        
        int vetor[] = new int[40];
        int soma = 0;
        double media = 0;
        int cont = 0;
        int var1 = 0;
        int var2 = 0;
        int maior = 0;
        int menor = 0;
        
        
        ///Total de alunos com idade menor que 16 anos
        
        for(int i = 0; i < vetor.length; i++){
            id = JOptionPane.showInputDialog("Digite a idade do aluno "+(i+1));
            vetor[i] = Integer.parseInt(id);
            x = Integer.parseInt(id);
            if(x < 16){
                cont++;
            }
            if( x >= 16 && x <= 18 ){
                var1++;
            }
            if ( x > 18){
                var2++;
            }
            soma = soma + vetor[i];
            media = ( soma / 4);
            if ( x > maior){
                maior = x;
            }
            if ( x < maior){
                menor = x;
            }
        }
        System.out.println("Quantidade de alunos menores de 16 anos: "+cont);
        System.out.println("Quantidade de alunos que tem entre 16 e 18 anos: "+var1);
        System.out.println("Quantidade de alunos maiores de 18 anos: "+var2);
        System.out.println("Media da idade dos alunos : "+media);
        System.out.println("Aluno mais novo : "+menor);
        System.out.println("Aluno mais velho : "+maior);
    }
}

