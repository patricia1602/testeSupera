package desafio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParesEImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();  //Lista números pares
        List<Integer> impares = new ArrayList<>();  //Lista números ímpares

        for (int i = 0; i < 10; i++) {
            int valor = scanner.nextInt();

            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }

        }
        Collections.sort(pares); //Pares em ordem crescente
        Collections.sort(impares, Collections.reverseOrder()); //Ímpares em ordem decrescente
    
        for(int par : pares) {
            System.out.println(par);
        }
          for(int impar : impares) {
            System.out.println(impar);
        }

        scanner.close();
    }
}
