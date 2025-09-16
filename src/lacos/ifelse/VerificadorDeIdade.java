package lacos.ifelse;

import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Você está apto a tirar a carteira de motorista");
        }else {
            System.out.println("Você não está apto a tirar a carteira de motorista");
        }
        System.out.println("Você tem " + idade + " anos");
        leitor.close();
    }
}
