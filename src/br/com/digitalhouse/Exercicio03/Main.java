package br.com.digitalhouse.Exercicio03;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Lapis",10,5);

        estoque.mostra();

        System.out.println("Nome do produto: " + estoque.getNome() + "\r\n" +
                           "Quantidade minima: " + estoque.getQtdMinima() + "\r\n" +
                           "Quantidade atual: " + estoque.getQtdAtual());

        estoque.mudarNome("Caneta");

        estoque.mudarQtdMinima(7);

        estoque.mostra();

        System.out.println("Nome do produto: " + estoque.getNome() + "\r\n" +
                           "Quantidade minima: " + estoque.getQtdMinima() + "\r\n" +
                           "Quantidade atual: " + estoque.getQtdAtual());

        estoque.precisaRepor();

        estoque.darBaixa(9);

        estoque.mostra();

        System.out.println("Nome do produto: " + estoque.getNome() + "\r\n" +
                           "Quantidade minima: " + estoque.getQtdMinima() + "\r\n" +
                           "Quantidade atual: " + estoque.getQtdAtual());

        estoque.precisaRepor();

        estoque.repor(10);

        estoque.mostra();

        System.out.println("Nome do produto: " + estoque.getNome() + "\r\n"+
                "Quantidade minima: " + estoque.getQtdMinima() + "\r\n" +
                "Quantidade atual: " + estoque.getQtdAtual());

    }
}
