import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Fatorial : solicitar um número
        //4! = 4 * 3 * 2 * 1
        //5! = 5 * 4 * 3 * 2 * 1
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        int fatorial = 1;

        for(int i = numero; i >=1; i--){
            fatorial = fatorial * i;
        }
        System.out.println(numero + "! + " + fatorial);
    }
}
