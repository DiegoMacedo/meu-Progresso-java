package desafios;

import java.util.Scanner;

public class AventuraSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("\n--- Aventura na Floresta Perdida ---");
            System.out.println("Você acorda em uma clareira, sem saber como chegou lá.");
            System.out.println("À sua frente, há dois caminhos.");
            System.out.println("1. Seguir o caminho estreito que entra na floresta escura.");
            System.out.println("2. Seguir a trilha que leva a um rio barulhento.");
            System.out.print("Qual é a sua escolha? ");
            int escolha1 = teclado.nextInt();

            // Lógica Futura
            if (escolha1 == 1){
                System.out.println("\nVocê entra na floresta escura. Os sons da natureza parecem distantes.");
                System.out.println("Você encontra uma cabana abandonada.");
                System.out.println("1. Entrar na cabana para investigar.");
                System.out.println("2. Ignorar a cabana e continuar pela floresta.");
                System.out.print("O que você faz? ");
                int escolha2 = teclado.nextInt();
                if(escolha2 == 1){
                    System.out.println("\nDentro da cabana, você encontra um mapa que mostra a saída da floresta!");
                    System.out.println("Você segue o mapa e encontra uma estrada segura. PARABÉNS, VOCÊ VENCEU!");
                }else {
                    System.out.println("\nAo ignorar a cabana, você se perde ainda mais na escuridão.");
                    System.out.println("Você nunca mais encontra o caminho de volta. FIM DE JOGO.");
                }
            } else if (escolha1 == 2) {
                System.out.println("\nVocê segue o som do rio e chega à sua margem.");
                System.out.println("Você vê uma pequena canoa amarrada a uma árvore.");
                System.out.println("1. Usar a canoa para descer o rio.");
                System.out.println("2. Tentar atravessar o rio a nado.");
                System.out.print("O que você faz? ");
                int escolha3 = teclado.nextInt();
            }else {
                System.out.println("\nVocê fica paralisado pela indecisão e a noite chega. Fim de jogo.");
            }

            System.out.println("\nFim da Aventura!");
            System.out.println("Deseja jogar novamente? (s/n)");
            String jogarDeNovo = teclado.next();
            if (jogarDeNovo.equals("n")){
                break;
            }
        }
        System.out.println("Obrigado Por Jogar Conosco");
        teclado.close();
    }
}
