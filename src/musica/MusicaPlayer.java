package musica;

public class MusicaPlayer implements Musica {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
}