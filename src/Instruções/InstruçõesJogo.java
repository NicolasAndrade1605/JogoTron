package Instruções;

public class InstruçõesJogo {

    private static class instrucoes {
        public void escritaInstrucoes(){
            System.out.println("AS instruções do jogo");

        }
    }

    public static void main(){
        instrucoes imprimir = new instrucoes();
        imprimir.escritaInstrucoes();
    }

}
