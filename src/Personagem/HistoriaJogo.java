package Personagem;

import Instruções.InstruçõesJogo;

public class HistoriaJogo {
    private static class historia {
        public void escritaHistoriaJogo(){
            System.out.println("A historia do Jogo ");

        }
    }

    public static void main(){
        historia jogo = new historia();
        jogo.escritaHistoriaJogo();

    }
}
