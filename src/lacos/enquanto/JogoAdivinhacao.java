package lacos.enquanto;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroSecreto = 42;
        int palpite = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("------Jogo Da Adivinhação------");
        System.out.println("Tente encontrar um número entre (0 e 100) ");

        while (palpite  != numeroSecreto){
            System.out.println("Digite um valor entre (0 e 100) ");
            palpite = teclado.nextInt();

            if(palpite < 0 || palpite > 100){
                System.out.println("Ops, intervalo inválido!");
            }else if (palpite < numeroSecreto){
                System.out.println("Aumente o seu palpite");
            }else if(palpite > numeroSecreto){
                System.out.println("Diminua seu palpite");
            }else{
                System.out.println("Parabéns, você acertou!!!");
            }
        }
        System.out.println("GAME OVER!!!");
        teclado.close();
    }
}
