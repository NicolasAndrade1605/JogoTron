package Menu;

import Personagem.CriaçãoPersonagem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MenuDoJogo {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args)

    {

        String opcao;

        System.out.println("Olá! Seja bem vindo ao Reino Hello World! ");

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

                    break;

                case "2":
                    System.out.println("Instruções: ");

                    break;
                case "3":
                    System.out.println("Créditos: ");


                    break;

                default:
                    System.out.println("Opção Invalida!");
            }

        }while (opcao.equals("4") == false);

    }

    static void InformacaoUsu(String nome, String Classes)
    {
        System.out.println("Informe seu nome: ");
        nome = scan.next();

        System.out.println("Informe sua classe desejada: ");
        Classes = scan.next();
    }
}
