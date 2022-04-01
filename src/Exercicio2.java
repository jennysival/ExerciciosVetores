import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        String[] listaAlunos = new String[10]; 
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o nome "+i+":");
            listaAlunos[i] = leitor.next();
        }

        System.out.println("----------------------------");
        System.out.println("        LISTA NOMES         ");
        System.out.println("----------------------------");

        for(int i = 0; i < 10; i++){
            System.out.println(i+": "+listaAlunos[i]);
        }

    }
}
