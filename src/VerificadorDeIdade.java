import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite sua idade: ");
        int idade = leitor.nextInt();

       if(idade >= 18){
           System.out.println("Você é maior de idade!");
       }else {
           System.out.println("Você é menor de idade!");
       }
        leitor.close();
    }
}
