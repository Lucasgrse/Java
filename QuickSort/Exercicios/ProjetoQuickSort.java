/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoquicksort;

/**
 *
 * @author lucas
 */
public class ProjetoQuickSort {

    public static void swap(int a[], int i, int j) {
        int T;
        T = a[i];
        a[i] = a[j];
        a[j] = T;
    }

    public static void QuickSort(int a[], int indiceEsquerdo, int indiceDireito) {
        int i = indiceEsquerdo;
        int j = indiceDireito;
        int mid;
        if (indiceDireito > indiceEsquerdo) {
            /* Pega o pivô.
             */
            mid = a[(indiceEsquerdo + indiceDireito) / 2];
            // repete até que as extremidades se cruzem
            while (i <= j) {
                /* procura o primeiro elemento que seja maior ou igual
 * ao pivê começando do lado esquerdo.
                 */
                while ((i < indiceDireito) && (a[i] < mid)) {
                    ++i;
                }
                /* procura o primeiro elemento que seja menor ou igual
 * ao pivô começando do lado direito.
                 */
                while ((j > indiceEsquerdo) && (a[j] > mid)) {
                    --j;
                }
                // se os índices não se cruzaram, efetua a troca
                if (i <= j) {
                    swap(a, i, j);
                    ++i;
                    --j;
                }
            }
            /* Ordenar a parte indiceEsquerdo.
             */
            if (indiceEsquerdo < j) {
                QuickSort(a, indiceEsquerdo, j);
            }
            /* Se os índices não se cruzaram,
 * ordenar a parte indiceDireito. 
             */
            if (i < indiceDireito) {
                QuickSort(a, i, indiceDireito);
            }
        }
    }

    public static void sort(int a[], int n) {
        QuickSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int v[] = {25, 48, 37, 12, 57, 86, 33, 92};

        System.out.println("\nVetor desordenado: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(v[i] + " ");
        }
        sort(v, 8);
        long inicio = System.currentTimeMillis();
        System.out.println("ms \n");
        System.out.println("Tempo igual a :" + inicio);
        System.out.println("ms");
        System.out.println("\nVetor ordenado: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(v[i] + " ");
        }
        long fim = System.currentTimeMillis();
        System.out.println("ms \n");
        System.out.println("Tempo final igual a: " + fim);
        System.out.println("ms");
        System.out.println("\nFim da impressão: ");
    }
}
