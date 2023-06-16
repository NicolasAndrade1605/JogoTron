package Personagem;

import Menu.MenuDoJogo;

import java.util.*;

public class NewPerguntas {

    static Scanner input = new Scanner(System.in);
    static Random chamada = new Random();
    static int tentativas = 0;

    public void perguntasJogoAzul() throws InterruptedException {
        List<Pergunta> listaPerguntasAzul = criarListaPerguntasAzul();
        Collections.shuffle(listaPerguntasAzul);

        for (Pergunta pergunta : listaPerguntasAzul) {
            pergunta.apresentarPergunta();
            pergunta.responder();
        }

    }
    public void perguntasJogoLaranja() throws InterruptedException {
        List<Pergunta> listaPerguntasLaranja = criarListaPerguntasLaranja();
        Collections.shuffle(listaPerguntasLaranja);

        for (Pergunta pergunta : listaPerguntasLaranja) {
            pergunta.apresentarPergunta();
            pergunta.responder();
        }

    }

    public List<Pergunta> criarListaPerguntasAzul() {
        List<Pergunta> listaPerguntas = new ArrayList<>();

        listaPerguntas.add(new Pergunta("Uma empresa deseja construir uma região de segurança para cercar seu estacionamento.\n" +
                "Sua área será dada pela função A(x) = x² – 17x + 78,\n" +
                "sendo x a largura escolhida para essa região.\n" +
                "Qual será a área desta região de segurança,\n" +
                "em m², quando a largura escolhida for 8 m?",
                "a", "a: 6", "b: 7", "c: 8", "d: 10"))
        ;

        listaPerguntas.add(new Pergunta("Observe a função quadrática a seguir. Para quais valores de x essa função assume o valor igual a zero?\n" +
                "y = x² - 8x + 15",
                "c", "a: -8 e 15", "b: -7 e 7", "c: 3 e 5", "d: 3 e 15"))
        ;

        listaPerguntas.add(new Pergunta("Quais são as raízes da equação x²- 14x + 48 = 0?",
                "a", "a: 6 e 8", "b: -6 e -8", "c: 4 e 12", "d: -4 e 12"))
        ;

        listaPerguntas.add(new Pergunta("O número hexadecimal 2AE equivale ao decimal?",
                "c", "a: 484", "b: 585", "c: 686", "d: 787"))
        ;

        listaPerguntas.add(new Pergunta("Convertendo o número hexadecimal 2A1(16), qual alternativa apresenta a sua conversão adequada ao sistema decimal?",
                "b", "a: 298", "b: 673", "c: 2578", "d: 2593"))
        ;

        listaPerguntas.add(new Pergunta("A respeito dos conjuntos numéricos, de suas definições e das relações de inclusão existentes entre eles, assinale a alternativa verdadeira.",
                "c", "a: O conjunto dos números naturais é formado por todos os números inteiros.",
                "b: O conjunto dos números inteiros é formado apenas por todos os números inteiros positivos e negativos.",
                "c: O conjunto dos números inteiros contém o conjunto dos números naturais.",
                "d: O conjunto dos números reais é disjunto (separado) do conjunto dos números racionais."))
        ;

        return listaPerguntas;
    }
    public List<Pergunta> criarListaPerguntasLaranja() {
        List<Pergunta> listaPerguntas = new ArrayList<>();

        listaPerguntas.add(new Pergunta("Assinale Verdadeiro ou Falso.\n " +
                "101011 (2) = 53 (10)",
                "b", "a: Verdadeiro", "b: Falso"))
        ;

        listaPerguntas.add(new Pergunta("A soma entre os 4 sucessores de um número natural é igual a 1.038. Qual é o número natural?",
                "c", "a: 250", "b: 255", "c: 258", "d: 260"))
        ;

        listaPerguntas.add(new Pergunta("Considere a equação 10x²-1000=0. O conjunto solução da equação dada corresponde a ...",
                "b", "a: S={-1, +1}", "b: S={-10, +10}", "c: S={-100, +100}", "d: S={-1000, +1000}"))
        ;

        listaPerguntas.add(new Pergunta("Ao resolver a eqaução do 1° grau: 4.(x-3)-x=24+x, temos a solução:",
                "d", "a: x=6", "b: x-12", "c: x=16", "d: x=18"))
        ;

        listaPerguntas.add(new Pergunta("Convertendo o número hexadecimal 2A1(16), qual alternativa apresenta a sua conversão adequada ao sistema binário?",
                "a", "a: 1010100001", "b: 1010101001", "c: 1010101010", "d: 1111100000"))
        ;

        listaPerguntas.add(new Pergunta("Qual o proximo termo da sequência?\n " +
                "-8, -10, -12, ...",
                "b", "a: -18", "b: -14", "c: 17", "d: 14"))
        ;

        listaPerguntas.add(new Pergunta("Qual o proximo termo da sequência dos números impares?\n " +
                "117, 115, 113, ...",
                "b", "a: -110", "b: 111", "c: -111", "d: 125"))
        ;

        listaPerguntas.add(new Pergunta("Escreva o termo que esta faltando na sequência\n " +
                "12, 15, 18, 24, ...",
                "d", "a: -23", "b: -21", "c: 22", "d: 21"))
        ;


        return listaPerguntas;
    }

    private static class Pergunta{

        private final String enunciado;

        private final String[] alternativas;

        private String respostaCorreta;

        public Pergunta(String enunciado,String respostaCorreta ,String... alternativas){
            this.enunciado = enunciado;
            this.alternativas = alternativas;
            this.respostaCorreta = respostaCorreta;

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
            }while (!resposta.equals(respostaCorreta) && tentativas >=3);
                if (tentativas == 3){
                    System.out.println("Você passou do limite de tentativas. Comece novamente!");
                    Thread.sleep(3000);
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

        String classe;

        String[] Azul = {};

        String[] Laranja = {};

        while(true)
        {
            System.out.println("Qual a Classe escolhida: \na) Azul\nb) Laranja");
            classe = input.next().toLowerCase();

            if (classe.equals("a")){
                Pergunta.perguntasJogoAzul();

                break;
            } else if (classe.equals("b")) {
                Pergunta.perguntasJogoLaranja();

                break;
            }else {
                System.out.println("Opção Invalida!");
            }
        }



    }
}
