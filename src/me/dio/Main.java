package me.dio;

import me.dio.interfaces.AparelhoTelefonico;
import me.dio.interfaces.NavegadorInternet;
import me.dio.interfaces.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo();

        ReprodutorMusical reprodutorMusical = dispositivo;
        AparelhoTelefonico aparelhoTelefonico = dispositivo;
        NavegadorInternet navegadorInternet = dispositivo;

        System.out.println("Executando ações referentes ao reprodutor musical");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        System.out.println("\n" + "Executando ações referentes ao aparelho telefônico");
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("\n" + "Executando ações referentes ao navegador de internet");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}