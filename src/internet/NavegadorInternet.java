package internet;

public class NavegadorInternet implements Internet {
    @Override
    public void abrirPagina() {
        System.out.println("Abrindo a página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba com a página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}