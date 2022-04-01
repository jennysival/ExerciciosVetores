public class Exercicio1 {
    public static void main(String[] args) {
        int vetorN[] = new int[6];

        vetorN[0] = 5;
        vetorN[1] = 5;
        vetorN[2] = 5;
        vetorN[3] = 5;
        vetorN[4] = 5;
        vetorN[5] = 5; //total = 30

        int soma = 0;

        for(int i = 0; i < vetorN.length; i++){
            soma = soma+vetorN[i];
        }
        System.out.println("O resultado da soma dos vetores é: "+soma);
    }
}
