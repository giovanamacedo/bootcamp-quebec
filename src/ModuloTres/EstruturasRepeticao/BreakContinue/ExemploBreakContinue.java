package ModuloTres.EstruturasRepeticao.BreakContinue;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println(i); //imprime todos os números menos o 3
        }
    }
}
