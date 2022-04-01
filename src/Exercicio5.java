import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a sua banda preferida?");
        String banda = leitor.nextLine();

        String[] musicas = new String[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Escreva o nome de uma música de "+banda);
            musicas[i] = leitor.nextLine();
        }

        System.out.println("-------------");
        System.out.println(banda);
        System.out.println("-------------");

        for(int i = 0; i < 3; i++){
            System.out.println(musicas[i]);
        }
    }
}
