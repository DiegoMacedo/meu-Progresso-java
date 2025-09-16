package lacos.enquanto;

public class ContadorWhile {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10){
            System.out.println("Número: " + contador);
            contador = contador +1;
        }
        System.out.println("Fim da contagem");
    }
}
