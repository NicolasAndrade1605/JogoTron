package Menu;

import Instruções.Creditos;
import Instruções.InstruçõesJogo;
import Personagem.CriaçãoPersonagem;
import Personagem.HistoriaJogo;
import Personagem.NewPerguntas;
import Personagem.Perguntas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MenuDoJogo {
    static Scanner scan = new Scanner(System.in);




    public static void main(String[] args) throws InterruptedException {

        String opcao;
        String opcao1;

        System.out.println("Olá! Seja bem vindo ao Jogo TRON! ");

        System.out.println("Escolha uma das opções a seguir: ");

        System.out.println("1: Jogar");
        System.out.println("2: Instruções");
        System.out.println("3: Créditos");
        System.out.println("4: Sair");

        do
        {
            opcao = scan.next();

            switch (opcao)
            {
                case "1":
                    System.out.println("Bora Jogar! ");
                    CriaçãoPersonagem.main();
                    Thread.sleep(5000);
                    NewPerguntas.main();
                    System.out.println("Parabens você acertou todas as respostas!");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Você conclui o objetivo do ");

                    break;

                case "2":
                    System.out.println("Instruções: ");

                    System.out.println("1: História do Jogo");
                    System.out.println("2: Instruções do Jogo");
                    System.out.println("3: Voltar ao Menu do Jogo");

                    do
                    {

                        opcao1 = scan.next();


                        switch (opcao1) {
                            case "1":
                                HistoriaJogo.main();

                                break;

                            case "2":
                                InstruçõesJogo.main();

                                break;

                            default:
                                System.out.println("1: Jogar");
                                System.out.println("2: Instruções");
                                System.out.println("3: Créditos");
                                System.out.println("4: Sair");

                        }
                    }
                    while (opcao1.equals("3") == false);

                    break;
                case "3":
                    System.out.println("Créditos: ");
                    Creditos.main();

                    break;

                default:
                    System.out.println("Saindo do JOGO!!!");
            }

        }
        while (opcao.equals("4") == false);

    }

}
