package desafios;

import java.util.Scanner;

public class Calculaçdora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("\n TABUADA INTERATIVA ");
            System.out.println("|----------------------|");
            System.out.println("|   1- Adição          |");
            System.out.println("|   2- Subtração       |");
            System.out.println("|   3- Multiplicação   |");
            System.out.println("|   4- Divisão         |");
            System.out.println("|   0- Sair            |");
            System.out.println("|______________________|");

            System.out.println("Digite o número da operação: ");
            int opcao = teclado.nextInt();

            if(opcao == 0){
                System.out.println("Programa Encerrado!");
                break;
            }
            if(opcao >= 1 && opcao <= 4){
                System.out.println("Digite o primeiro número: ");
                double num1 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = teclado.nextDouble();

                if(opcao == 1){
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (opcao == 2) {
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (opcao == 3) {
                    System.out.println("Resultado: " + num1 + " x " + num2 + " = " + (num1 * num2));
                } else if (opcao == 4) {
                    if (num2 == 0){
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }else {
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }

                }
            }
        }
        teclado.close();
    }
}
