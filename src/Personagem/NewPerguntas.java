package Personagem;

import Menu.MenuDoJogo;

import java.util.*;

public class NewPerguntas {

    static Scanner input = new Scanner(System.in);
    static Random chamada = new Random();
    static int tentativas = 0;

    public void perguntasJogo() throws InterruptedException {
        List<Pergunta> listaPerguntas = criarListaPerguntas();
        Collections.shuffle(listaPerguntas);

        for (Pergunta pergunta : listaPerguntas) {
            pergunta.apresentarPergunta();
            pergunta.responder();
        }
    }

    public List<Pergunta> criarListaPerguntas(){
        List<Pergunta> listaPerguntas = new ArrayList<>();

        listaPerguntas.add(new Pergunta ("Uma empresa deseja construir uma região de segurança para cercar seu estacionamento.\n" +
                "Sua área será dada pela função A(x) = x² – 17x + 78,\n" +
                "sendo x a largura escolhida para essa região.\n" +
                "Qual será a área desta região de segurança,\n" +
                "em m², quando a largura escolhida for 8 m?", "a","a: 6", "b: 7", "c: 8", "d: 10"))
        ;

        listaPerguntas.add(new Pergunta ("Observe a função quadrática a seguir. Para quais valores de x essa função assume o valor igual a zero?\n" +
                "y = x² - 8x + 15", "c", "a: -8 e 15", "b: -7 e 7", "c: 3 e 5", "d: 3 e 15"))
        ;

        return listaPerguntas;
    }

    private static class Pergunta{

        private String enunciado;

        private String[] alternativas;

        private String respostaCorreta;

        public Pergunta(String enunciado,String respostaCorreta ,String... alternativas){
            this.enunciado = enunciado;
            this.alternativas = alternativas;

        }

        public void apresentarPergunta(){
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(enunciado);
            System.out.println("-----------------------------------");
            System.out.println("Qual a resposta correta?");
            System.out.println("-----------------------------------");

            for (String alternativa : alternativas) {
                System.out.println(alternativa);
            }
        }

        public void responder() throws InterruptedException {
            String resposta;

            String opcao;

            do {
                resposta = input.next();
                tentativas++;

                if (resposta.equals(respostaCorreta)){
                    System.out.println("Resposta Correta ");

                }else {
                    System.out.println("Resposta Incorreta!");

                }
            }while (!resposta.equals(respostaCorreta) && tentativas <3);
                if (tentativas >= 3){
                    System.out.println("Você passou do limite de tentativas. Comece novamente!");
                    Thread.sleep(4000);
                    System.out.println();
                    System.out.println("1: Jogar Novamente");
                    System.out.println("2: Sair");

                    do
                    {
                        opcao = input.next();

                        switch (opcao){
                            case "1" :
                                System.out.println("Começando Novamente!");
                                main()
                                ;

                                break;

                            case "2" :
                                System.out.println("Saindo...");
                                System.exit(0);
                        }

                    }while (opcao.equals("2") == true);

                }
        }
    }
    public static void main() throws InterruptedException {
        NewPerguntas Pergunta = new NewPerguntas();
        Pergunta.perguntasJogo();

    }
}
