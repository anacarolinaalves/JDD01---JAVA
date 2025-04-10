import java.util.Scanner;

public class ComandoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0, media, numeroAlunos;

        for(numeroAlunos =1; numeroAlunos <=5; numeroAlunos++){
            System.out.println("Digite a idade " + numeroAlunos + "º aluno: ");
            idade = idade + leitor.nextInt();
        }
        media = idade/5;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }
}
