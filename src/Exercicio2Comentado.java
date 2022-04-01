import java.util.Scanner;

public class Exercicio2Comentado {
    public static void main(String[] args) {

        //Passo 1: Criar vetor e Scanner (e variáveis caso precise):
        String[] listaAlunos = new String[10]; //Criei vetor do tipo String(texto) com o nome de listaAlunos, e com o tamanho de 10 (0 a 9);
        Scanner leitor = new Scanner(System.in); //Criei um Scanner chamado "leitor" para armazenar dados que o usuário inserir;


        //Passo 2: Criar o primeiro loop de repetição para coletar os nomes em suas respectivas posições do vetor (0 a 9):
        for(int i = 0; i < 10; i++){// Criei o for(repetição), onde o "i" é uma variável contadora que inicia a contagem no 0, depois informo que i é menor que 10(tamanho do meu vetor listaAlunos / poderia ser listaAlunos.length), e o i++ serve pra acrescentar 1 contagem a cada loop até o limite estipulado pelo i<10;
            System.out.println("Digite o nome "+i+":");//Criei o campo para o usuário poder digitar os nomes, indicando a posiçao do nome com +i;
            listaAlunos[i] = leitor.next();//Inseri o vetor listaAlunos, onde o [i] indica em qual contador do vetor está no loop (de 0 a 9), e o leitor para armazenar os dados que o usuário digitou;
        }

        //Passo 3: Exibir as informações pro usuário:
        System.out.println("____________________________");
        System.out.println("        LISTA NOMES         ");    // Mostrei o título com o sout
        System.out.println("____________________________");

        //Passo 3-b: Criar o segundo loop de repetição:
        for(int i = 0; i < 10; i++){//Criei o segundo for(repetição), i sendo a variável contadora que inicia a contagem no 0 (assim como o vetor começa no 0), depois i menor que 10(o tamanho da minha variavel / poderia ser listaAlunos.length), e o i++ acrescenta 1 número em cada loop para ir rodando até chegar no número final (nesse caso <10 = 0 a 9);
            System.out.println(i+": "+listaAlunos[i]);//Exibi pro usuário o i(o número referente a posição do meu vetor), seguido de dois pontos escritos(":"), e o nome do aluno que o meu usuário inseriu sendo o nome do vetor listaAlunos seguido de [i] que indica a posição no vetor do respectivo nome;
        }

    }
}
