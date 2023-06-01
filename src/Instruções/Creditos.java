package Instruções;

public class Creditos {

    private static class creditos{
        public void escritaCreditos(){
            System.out.println("_________ CRÉDITOS _________");
            System.out.println("Programa escrito por: Nicolas Andrade ");
            System.out.println("Data: -----------");
        }
    }

    public static void main() {
        creditos credito = new creditos();
        credito.escritaCreditos();
    }
}
