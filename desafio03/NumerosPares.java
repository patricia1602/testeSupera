package desafio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o tamanho do lista (n): "); 
        int n = scanner.nextInt();

        System.out.println("Informe o valor (K): ");
        int k = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Informe os números do array separados por espaço: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int resultado = valorParComDiferenca(array, k);
        System.out.println("Número de pares cuja diferença é igual a " + k + ": " + resultado);

        scanner.close();
    }

    private static int valorParComDiferenca(int[] array, int k) {
        // HashMap para armazenar a frequência dos números
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int valor = 0;
        for (int num : array) {
            // Para cada elemento do array, verificamos se a diferença (num - k) está
            // presente no HashMap
            int diferente = num - k;
            if (frequencyMap.containsKey(diferente)) {
                valor += frequencyMap.get(diferente);
            }
            // O par (num, diff) é contado apenas uma vez, então removemos o elemento atual
            // do HashMap
            if (k == 0) {
                frequencyMap.remove(num);

            }
        }

        return valor;
    }

}