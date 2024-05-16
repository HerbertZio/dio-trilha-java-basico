package telefone;

public class TelefoneCelular implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Ligando para o contato...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}