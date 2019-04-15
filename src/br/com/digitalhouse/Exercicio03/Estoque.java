package br.com.digitalhouse.Exercicio03;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {

        this.nome = nome;

        if (qtdAtual < 0) {
            this.qtdAtual = 0;
        } else {
            this.qtdAtual = qtdAtual;
        }

        if (qtdMinima < 0) {
            this.qtdMinima = 0;
        } else {
            this.qtdMinima = qtdMinima;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void mudarNome(String nome) {

        setNome(nome);

    }

    public void mudarQtdMinima(int qtdMinima) {

        setQtdMinima(qtdMinima);
    }

    public void repor(int qtd) {

        setQtdAtual(getQtdAtual() + qtd);

    }

    public void darBaixa(int qtd) {

        setQtdAtual(getQtdAtual() - qtd);

    }

    public String mostra() {

        return "Nome do produto: " + getNome() + "\r\n" +
               "Quantidade minima: " + getQtdMinima() + "\r\n" +
               "Quantidade atual: " + getQtdAtual();
    }

    public boolean precisaRepor() {

        if (getQtdAtual() <= getQtdMinima()) {

            return true;

        } else {

            return false;
        }

    }
}
