public class ListaChamada {
    public static void main(String[] args) {
        
        String[] listaAlunos = new String[3];

        listaAlunos[0] = "Jenny";
        listaAlunos[1] = "Jessica";
        listaAlunos[2] = "Joana";

        for(int i = 0; i < listaAlunos.length; i++){
            System.out.println("Aluno(a): "+listaAlunos[i]);
        }
    }
}
