import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.Telefone;

/**
 * Desafio de conceitos de diagramação UML e programação orientada a objetos,
 * baseado no lançamento do primeiro iPhone em 2007
 */

public class Iphone implements Telefone, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) throws Exception {

    }

    // Reprodutor Musical
    public void Reproduzir() {
        System.out.println("Reproduzindo música.");
    }

    public void Pausar() {
        System.out.println("Pausando música.");
    }

    public void SelecionarMusica(String musica) {
        System.out.println("Buscando a música: " + musica);
    }

    // Navegador de Internet
    public void ExibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    public void AdicionarAba() {
        System.out.println("Criando nova aba.");
    }

    public void AtualizarPagina() {
        System.out.println("Atualizando página.");
    }

    // Telefone
    public void RealizarChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void AtenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    public void IniciarCorreioVoz() {
        System.out.println("Ligando para o correio de voz.");
    }
}
