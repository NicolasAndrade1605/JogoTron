package Personagem;

import Instruções.InstruçõesJogo;

public class HistoriaJogo {
    private static class historia {
        public void escritaHistoriaJogo(){
            System.out.println("A historia do Jogo ");
            System.out.println();

            System.out.println(
                    "Após o personagem ter entrado no Fliperama afim de resgatar o seu pai, ele se depara com um  problema  insolucionável\n"
                            + "onde nenhuma das resposta que o usuário inserir serão validas como resposta certa.\n"
                            + "Assim que o Personagem está dentro do jogo ele se depara com a Nave Tron que o aprisiona e são feitas  sequências  de\n"
                            + "perguntas a ele que irão direcionar o caminho seguido por ele. (nesse momento será selecionado a Classe do Personagem\n"
                            + "e as habilidades que irão direcioná-lo pelo caminho assim podendo obter ajuda de outros companheiros).\n"
                            + "Quando o jogador passar pela sala de roupa e receber o seu disco estará apto a concluir desafios mais complexos  onde\n"
                            + "exigiram calculos mais complexos de acordo com o nivel do personagem de cada usuário.\n"
                            + "Serão encaminhado os usuários ao campo de batalha onde um deles será eliminado afim de  que os outros consigam evoluir\n"
                            + "de fase.\n"
                            + "Após o jogadores terem conseguido completar os desafios eles são levados a Sala do mestre Supremo 'CLU'.");

            System.out.println();

            System.out.println("Retornar ao menu [3]: ");

        }
    }

    public static void main(){
        historia jogo = new historia();
        jogo.escritaHistoriaJogo();

    }
}
