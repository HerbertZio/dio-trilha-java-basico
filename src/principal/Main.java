package principal;

import musica.MusicaPlayer;
import telefone.TelefoneCelular;
import internet.NavegadorInternet;

public class Main {
    public static void main(String[] args) {
        MusicaPlayer musica = new MusicaPlayer();
        TelefoneCelular telefone = new TelefoneCelular();
        NavegadorInternet internet = new NavegadorInternet();

        IPhone iPhone = new IPhone(musica, telefone, internet);

        iPhone.reproduzirMusica();
        iPhone.tocarMusica();
        iPhone.pausarMusica();

        System.out.println();

        iPhone.ligarTelefone();
        iPhone.atenderTelefone();
        iPhone.iniciarCorreioDeVoz();

        System.out.println();

        iPhone.abrirPaginaInternet();
        iPhone.adicionarNovaAbaInternet();
        iPhone.atualizarPaginaInternet();
    }
}