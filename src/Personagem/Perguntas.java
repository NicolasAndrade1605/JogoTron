package Personagem;

import java.util.Scanner;

public class Perguntas {

    static Scanner input = new Scanner(System.in);

    private static class perguntas{

        public void Pergunta1(){

            String pergunta1;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Uma empresa deseja construir uma região de segurança para cercar seu estacionamento.\n" +
                            "Sua área será dada pela função A(x) = x² – 17x + 78,\n" +
                            "sendo x a largura escolhida para essa região.\n" +
                            "Qual será a área desta região de segurança,\n" +
                            "em m², quando a largura escolhida for 8 m?"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            );

            System.out.println("a: 6");
            System.out.println("b: 7");
            System.out.println("c: 8");
            System.out.println("d: 10");

            do
            {
                pergunta1 = input.next();

                switch (pergunta1)
                {
                    case "a":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "c":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta1.equals("a") == false);

        }

        public void Pergunta2(){

            String pergunta2;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Observe a função quadrática a seguir. Para quais valores de x essa função assume o valor igual a zero?\n" +
                            "y = x² - 8x + 15"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: -8 e 15");
            System.out.println("b: -7 e 7");
            System.out.println("c: 3 e 5");
            System.out.println("d: 3 e 15");

            do
            {
                pergunta2 = input.next();

                switch (pergunta2)
                {
                    case "c":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta2.equals("c") == false);

        }

        public void Pergunta3() {

            String pergunta3;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Quais são as raízes da equação x²- 14x + 48 = 0?"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: 6 e 8");
            System.out.println("b: -6 e -8");
            System.out.println("c: 4 e 12");
            System.out.println("d: -4 e 12");

            do
            {
                pergunta3 = input.next();

                switch (pergunta3)
                {
                    case "a":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "c":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta3.equals("a") == false);

        }
        public void Pergunta4() {

            String pergunta4;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "O número hexadecimal 2AE equivale ao decimal?"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: 484");
            System.out.println("b: 585");
            System.out.println("c: 686");
            System.out.println("d: 787");

            do
            {
                pergunta4 = input.next();

                switch (pergunta4)
                {
                    case "c":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta4.equals("c") == false);

        }
        public void Pergunta5() {

            String pergunta5;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Convertendo o número hexadecimal 2A1(16), qual alternativa apresenta a sua conversão adequada ao sistema decimal?"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: 298");
            System.out.println("b: 673");
            System.out.println("c: 2578");
            System.out.println("d: 2593");

            do
            {
                pergunta5 = input.next();

                switch (pergunta5)
                {
                    case "b":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "c":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta5.equals("b") == false);

        }
        public void Pergunta6() {

            String pergunta6;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "A respeito dos conjuntos numéricos, de suas definições e das relações de inclusão existentes entre eles, assinale a alternativa verdadeira."
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: O conjunto dos números naturais é formado por todos os números inteiros.");
            System.out.println("b: O conjunto dos números inteiros é formado apenas por todos os números inteiros positivos e negativos.");
            System.out.println("c: O conjunto dos números inteiros contém o conjunto dos números naturais.");
            System.out.println("d: o conjunto dos números reais é disjunto (separado) do conjunto dos números racionais.");

            do
            {
                pergunta6 = input.next();

                switch (pergunta6)
                {
                    case "c":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta6.equals("c") == false);

        }
        public void Pergunta7() {

            String pergunta7;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Assinale Verdadeiro ou Falso.\n " +
                            "101011 (2) = 53 (10)"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: Verdadeiro");
            System.out.println("b: Falso");


            do
            {
                pergunta7 = input.next();

                switch (pergunta7)
                {
                    case "b":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta7.equals("b") == false);

        }
        public void Pergunta8() {

            String pergunta8;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "A soma entre os 4 sucessores de um número natural é igual a 1.038. Qual é o MENOR número natural?"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: 250");
            System.out.println("b: 255");
            System.out.println("c: 258");
            System.out.println("d: 260");

            do
            {
                pergunta8 = input.next();

                switch (pergunta8)
                {
                    case "c":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta8.equals("c") == false);

        }
        public void Pergunta9() {

            String pergunta9;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Considere a equação 10x² - 1000 = 0. O conjunto solução da equação dada corresponde a ... "
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: S = {-1, +1}");
            System.out.println("b: S = {-10, +10}");
            System.out.println("c: S = {-100, +100}");
            System.out.println("d: S = {-1000, +1000}");

            do
            {
                pergunta9 = input.next();

                switch (pergunta9)
                {
                    case "b":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "c":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "d":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta9.equals("b") == false);

        }
        public void Pergunta10() {

            String pergunta10;

            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println(
                    "Ao resolver a equação do 1° grau: 4.(x - 3) - x = 24 + x, temos a solução:"
            )
            ;

            System.out.println(
                    "-----------------------------------\n" +
                            "Qual a resposta correta?\n" +
                            "-----------------------------------"
            )
            ;

            System.out.println("a: x = 6");
            System.out.println("b: x = 12");
            System.out.println("c: x = 16");
            System.out.println("d: x = 18");

            do
            {
                pergunta10 = input.next();

                switch (pergunta10)
                {
                    case "d":
                        System.out.println("Resposta Correta! ");

                        break;

                    case "b":
                        System.out.println("Resposta Incorreta! ");

                        break;

                    case "a":
                        System.out.println("Resposta Incorreta!");

                        break;

                    case "c":
                        System.out.println("Resposta incorreta!");

                        break;

                    default:
                        System.out.println("Invalido!");
                }

            }
            while (pergunta10.equals("d") == false);

        }
    }

    public static void main()

    {
        perguntas pergunta = new perguntas();
        pergunta.Pergunta1();
        pergunta.Pergunta2();
        pergunta.Pergunta3();
        pergunta.Pergunta4();
        pergunta.Pergunta5();
        pergunta.Pergunta6();
        pergunta.Pergunta7();
        pergunta.Pergunta8();
        pergunta.Pergunta9();
        pergunta.Pergunta10();

    }
}
