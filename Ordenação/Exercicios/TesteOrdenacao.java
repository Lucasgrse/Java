package ordenacao;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class TesteOrdenacao {

    int contador = 0;

    public static void main(String[] args) {
        int n = 5;
        int numerosAleatorios[] = new int[n];
        carregarVetor(numerosAleatorios, n);
        System.out.println("Vetor desordenado");
        imprimirVetor(numerosAleatorios, n);
        System.out.println("\n");
        long inicio = System.currentTimeMillis(); //em milisegundos
        System.out.println("ms");
        bolha(numerosAleatorios, n);
        long fim = System.currentTimeMillis();
        System.out.println("ms");
        System.out.println("Tempo igual a " + (fim - inicio));
        System.out.println("\n");
        System.out.println("Vetor Ordenado");
        imprimirVetor(numerosAleatorios, n);
        System.out.println("\n");
        /* Scanner in = new Scanner(System.in);
for (int i = 0; i < vet.length; i++) {
System.out.println("Prezado usuário, por favor digite um número: ");
vet[i] = in.nextInt();
}
System.out.println("\n");
System.out.println("Desordenado");
for (int i = 0; i < vet.length; i++) {
System.out.println(vet[i]);
}
bolha(vet, 10);
System.out.println("\n");
System.out.println("Ordenado");
for (int i = 0; i < vet.length; i++) {
System.out.println(vet[i]);
}
System.out.println("\n");
System.out.println("Aleatórios");
carregarVetor(vet, 100);
for (int i = 0; i < vet.length; i++){
System.out.println(vet[i]);
}

}*/
    }

    public static void imprimirVetor(int v[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(" " + v[i]);
        }
    }

    public static void carregarVetor(int v[], int n) {
        for (int i = 0; i < n; i++) {
        }
    }

    public static int getRandom(int n) {
        Random random = new Random();
        return (int) (random.nextDouble() * n);
        /*Random random = new Random();
int vetor[] = new int[10];
for(int i = 0; i < vetor.length; i++){
vetor[i] = v[i];
v[i] = random.nextInt(10);
System.out.println(v[i]);
}
         */

    }

    public static void bolha(int v[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j + 1]) {
                    /* troca */
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
}
