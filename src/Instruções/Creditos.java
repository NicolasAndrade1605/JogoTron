package Instruções;

public class Creditos {

    private static class creditos{
        public void escritaCreditos(){
            System.out.println("_________ CRÉDITOS _________");
            System.out.println(
                    "Programa escrito por: Nicolas Andrade\n" +
                    "Juan Marinho\n" +
                    "Jaime Gadea\n" +
                    "José Henrique Pereira"
                    )
            ;
            System.out.println("Data de Finalização: 14/06/2023");
            System.out.println(
                    "Instituição: Centro Universitário Senac\n" +
                    "Curso: TADS Turma A - Noite\n" +
                    "Professor: Eduardo Takeo"
                    )
            ;
        }
    }

    public static void main() {
        creditos credito = new creditos();
        credito.escritaCreditos();
    }
}
