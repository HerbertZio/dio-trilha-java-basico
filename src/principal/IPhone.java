package principal;

import musica.Musica;
import telefone.Telefone;
import internet.Internet;

public class IPhone {
    private Musica musicaPlayer;
    private Telefone telefoneCelular;
    private Internet navegadorInternet;

    public IPhone(Musica musicaPlayer, Telefone telefoneCelular, Internet navegadorInternet) {
        this.musicaPlayer = musicaPlayer;
        this.telefoneCelular = telefoneCelular;
        this.navegadorInternet = navegadorInternet;
    }

    public void reproduzirMusica() {
        musicaPlayer.reproduzir();
    }

    public void tocarMusica() {
        musicaPlayer.tocar();
    }

    public void pausarMusica() {
        musicaPlayer.pausar();
    }

    public void ligarTelefone() {
        telefoneCelular.ligar();
    }

    public void atenderTelefone() {
        telefoneCelular.atender();
    }

    public void iniciarCorreioDeVoz() {
        telefoneCelular.iniciarCorreioDeVoz();
    }

    public void abrirPaginaInternet() {
        navegadorInternet.abrirPagina();
    }

    public void adicionarNovaAbaInternet() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPaginaInternet() {
        navegadorInternet.atualizarPagina();
    }
}