import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        int vetorNum[] = new int[10];

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número "+i+":");
            vetorNum[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
        if(vetorNum[i] % 2 == 0){
            System.out.println("Os números pares são: "+vetorNum[i]);
        }
    }

    }
}
