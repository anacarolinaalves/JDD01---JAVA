import java.util.Scanner;

public class MediaDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0, media, numeroAlunos;
        //inicializando a variavel da condição
        numeroAlunos = 1;
        do{
            System.out.println("Digite a idade " + numeroAlunos + "º aluno: ");
            idade = idade + leitor.nextInt();
            //Incremento - alterar a variavel da condicao para que em algum momento
            //ela se torne falsa
            numeroAlunos++;
        }while(numeroAlunos <= 5);
        media = idade/5;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }
}
