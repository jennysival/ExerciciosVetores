import java.util.Scanner;

public class Exercicio1B {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos números?");
        int qtdNumeros = leitor.nextInt();

        int listaNumeros[] = new int[qtdNumeros];

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite o valor do vetor na posição "+i+":");
            int numero = leitor.nextInt();
            listaNumeros[i] = numero;
            
        }
        System.out.println("LISTA NUMEROS");

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Posição "+i+" - valor: "+listaNumeros[i]);
        }

    }
}
