import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leitor.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número "+ numero + " é PAR!");
        }else {
            System.out.println("O número "+ numero + " é ÍMPAR!");
        }
        leitor.close();
    }
}
