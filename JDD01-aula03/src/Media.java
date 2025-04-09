import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int idade = 0, media, numeroAlunos;
        String continuar;
        //inicializando a variavel da condição

        numeroAlunos = 0;
        do{
            System.out.println("Digite a idade " + (numeroAlunos+1)+ "º aluno: ");
            idade = idade + leitor.nextInt();
            //Incremento - alterar a variavel da condicao para que em algum momento
            //ela se torne falsa
            numeroAlunos++;
            System.out.println("Deseja informar a idade de outro aluno?  [S/N]");
            continuar = leitorTexto.nextLine();
        }while(continuar.equalsIgnoreCase("s"));
        media = idade/numeroAlunos;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }
}
