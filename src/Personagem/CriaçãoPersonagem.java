package Personagem;

import java.util.Random;
import java.util.Scanner;

public class CriaçãoPersonagem {
    public static void main() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Bem vindo ao jogo RPG 'Tron' ");
        System.out.println("Crie seu personagem: ");
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Classe: ");
        System.out.println("Você pode escolher entre essas classes: " +
                "\n 1- AZUL" +
                "\n 2- LARANJA");
        String classe = entrada.nextLine();
        System.out.println("Nivel: ");
        int nivel = aleatorio.nextInt(101);
        System.out.println("Força: ");
        int forca = aleatorio.nextInt(101);
        System.out.println("Destreza: ");
        int destreza = aleatorio.nextInt(101);
        System.out.println("Inteligência: ");
        int inteligencia = aleatorio.nextInt(101);

        System.out.println();

        System.out.println("Personagem Criado! ");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nivel: " + nivel);
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Inteligência: " + inteligencia);

        System.out.println();

    }
}
