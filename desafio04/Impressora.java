package desafio04;

import java.util.Scanner;

public class Impressora {
    
     public static void main(String[] args) {
        //Cria um objeto
        Scanner scanner = new Scanner(System.in);

        // Lê um número inteiro da entrada
        int N = Integer.parseInt(scanner.nextLine());

        // Loop - é o número de cada caso de teste atual
        for (int i = 0; i < N; i++) {
           //Lê a linha de entrada, para vai ser decifrada
            String linha_impressa = scanner.nextLine();
            String linha_decifrada = desembaralharLinha(linha_impressa);
            System.out.println(linha_decifrada); //Imprime a linha que foi decifrada
        }

        scanner.close();
    }

    private static String desembaralharLinha(String linha) {
        int comprimento = linha.length() / 2;
        String metade_esquerda = linha.substring(0, comprimento);
        String metade_direita = linha.substring(comprimento);

        StringBuilder metade_esquerda_decifrada = new StringBuilder(metade_esquerda).reverse();
        StringBuilder metade_direita_decifrada = new StringBuilder(metade_direita).reverse();

        return metade_esquerda_decifrada.toString() + metade_direita_decifrada.toString();
    }

}
