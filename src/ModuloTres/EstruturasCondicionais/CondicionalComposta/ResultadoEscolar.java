package ModuloTres.EstruturasCondicionais.CondicionalComposta;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        int notaAprovacao = 7;

        System.out.println("Nota do aluno: " + nota);
        System.out.println("Nota par aprovação: " + notaAprovacao);

        if (nota <= notaAprovacao){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
