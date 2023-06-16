package Instruções;

public class InstruçõesJogo {

    private static class instrucoes {
        public void escritaInstrucoes() {
            System.out.println("AS instruções do jogo");
            System.out.println();
            System.out.println(
                    "O aluno tem o direito de selecionar o nome  que quiser em seu personagem, o mesmo tem as caracteristicas de\n"
                            + "Sam, que tem como objetivo voltar a sua vida normal fora do jogo, lidando com desafios de matemática a cada\n"
                            + "vilão que  aparece, resgatando seu pai  e trazendo-o junto com ele o maior vilão chamado CLU, que é o maior\n"
                            + "vilão do proprio  filme, onde tera três desafios mais difícies para o aluno tentar passar e assim conseguir\n"
                            + "exito no jogo.");
            System.out.println();
            System.out.println(
                    "O motivo do aluno ter  ido para dentro do jogo ? Uma curiosidade no fliperama,que o desafio com uma simples\n"
                            + "conta matemática,e esse erro lhe causou um grande pesadelo, confortando-o quando ele soube da existência de\n"
                            + "seu pai dentro do jogo.");
            System.out.println();
            System.out.println(

                    "Cada jogador terá três chances em cada fase como se fossem três vidas , ao fim dessas vidas será necessário\n"
                            + "reiniciar novamente, a cada erro o jogador irá a outros caminhos fazendo com que dificulte a saida do mesmo\n"
                            + "de dentro do jogo");
            System.out.println();
            System.out.println("Retornar ao menu [3]: ");

        }
    }

    public static void main() {
        instrucoes imprimir = new instrucoes();
        imprimir.escritaInstrucoes();
    }

}
