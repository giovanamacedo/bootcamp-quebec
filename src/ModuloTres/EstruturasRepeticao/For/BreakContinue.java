package ModuloTres.EstruturasRepeticao.For;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            //if (i == 3) break;
            //System.out.println(i); //RESULTADO 1 - 2

            if (i == 3) continue;
            System.out.println(i); //RESULTADO 1 - 2 - 4 - 5
        }
    }
}
