import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos itens terá na sua lista de compras?");
        int qtdItens = leitor.nextInt();

        String[] listaCompras = new String[qtdItens];

        for(int i = 0; i < listaCompras.length; i++){
            int Lista = i + 1;
            System.out.println("Digite o item "+Lista+":");
            listaCompras[i] = leitor.next();
        }

        System.out.println("-------------------------------");
        System.out.println("Aqui está sua lista de compras:");
        System.out.println("-------------------------------");
        
        for(int i = 0; i < listaCompras.length; i++){
            int Lista = i + 1;
            System.out.println(Lista+": "+listaCompras[i]);
        }

    }
}
