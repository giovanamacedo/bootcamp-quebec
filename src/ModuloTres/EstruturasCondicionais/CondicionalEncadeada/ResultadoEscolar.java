package ModuloTres.EstruturasCondicionais.CondicionalEncadeada;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        int notaAprovacao = 8;
        int notaMinima = 5;

        System.out.println("Nota do aluno: " + nota);
        System.out.println("Nota para aprovação: " + notaAprovacao);

        if (nota >= notaAprovacao){
            System.out.println("Aluno aprovado");
        } else if (nota >= notaMinima && nota < notaAprovacao){
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
