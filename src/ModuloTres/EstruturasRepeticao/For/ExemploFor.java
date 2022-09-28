package ModuloTres.EstruturasRepeticao.For;

public class ExemploFor {
    public static void main(String[] args) {

        /*for (int i = 0; i < 20; i++) {
            System.out.println("Contando: " + i);
        }*/

        String alunos[] = {"Giovana", "Mateus"};
        /*for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice " + i + " é " + alunos[i]);
        }*/

        //FOREACH
        for (String nomesAlunos: alunos) {
            System.out.println("Nome do aluno: " + nomesAlunos);
        }

    }
}
