package Iphone;

import ServicesIphone.AparelhoTelefonico;
import ServicesIphone.NavegadorInternet;
import ServicesIphone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo NF - Dreams");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("A música NF - Paralyzed foi selecionada");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação Atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }
}
