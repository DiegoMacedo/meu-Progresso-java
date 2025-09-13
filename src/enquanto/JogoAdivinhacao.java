package enquanto;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroSecreto = 42;
        int palpite = 0;

        System.out.println("Jogo da Adivinhação");
        System.out.println("Tente acertar o número entre (0 e 100)");

        while (palpite != numeroSecreto){
            System.out.println("Digite seu palpite: ");
            palpite = leitor.nextInt();

            if (palpite == numeroSecreto){
                System.out.println("Parabéns, você ACERTOU!!");
            }else{
                System.out.println("Que pena, você ERROU!!! TENTE NOVAMENTE");
            }
        }

        System.out.println("FIM DO JOGO!!!");
        leitor.close();

    }
}
