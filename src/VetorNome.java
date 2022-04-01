import java.util.Scanner;

public class VetorNome {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos nomes você quer inserir?");
        int qtdNomes = leitor.nextInt();

        String[] listaNomes = new String[qtdNomes];

        for(int i = 0; i < listaNomes.length; i++){
            System.out.println("Digite o nome da posição "+i+":");
            listaNomes[i] = leitor.nextLine();

            
        }

    }
}
