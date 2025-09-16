package lacos.para;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Calculadora de Tabuada ---");


        while(true) {
            System.out.println("\nDigite o número da sua tabuada ou -1 pra sair: ");
            if (teclado.hasNextInt()) {
                int numero = teclado.nextInt();

                if (numero == -1) {
                    System.out.println("Fim do Programa");
                    break;
                }
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.printf("%d x %2d = %d\n", numero, i, resultado);
                }
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                teclado.next();
            }
        }
        teclado.close();
    }
}
