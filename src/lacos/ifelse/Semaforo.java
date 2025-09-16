package lacos.ifelse;

import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o estado do semáforo:");
        String estado = leitor.nextLine();
        if(estado.equals("verde")){
            System.out.println("O semáforo está verde, você pode passar");
        }else if(estado.equals("amarelo")){
            System.out.println("O semáforo está amarelo, atenção");
        }else if(estado.equals("vermelho")){
            System.out.println("O semáforo está vermelho, pare");
        }else {
            System.out.println("Estado inválido");
        }
        leitor.close();
    }
}
