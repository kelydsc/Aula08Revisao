package br.com.digitalhouse.Exercicio02;

public class Itens {

    //atributo
    private int numeroItemFaturado;
    private String descricaoItem;
    private int qtdeCompradaItem;
    private double precoUnitarioItem;

    //construtor especifico
    public Itens(int numeroItemFaturado, String descricaoItem, int qtdeCompradaItem, double precoUnitarioItem) {
        this.numeroItemFaturado = numeroItemFaturado;
        this.descricaoItem = descricaoItem;

        //valida se a quantidade é negativa
        if(qtdeCompradaItem < 0){
            this.qtdeCompradaItem = 0;
        }else{
            this.qtdeCompradaItem = qtdeCompradaItem;
        }

        //valida preço Unitario
        if(precoUnitarioItem < 0.0d){
            this.precoUnitarioItem = 0;
        }else{
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    //Getter e setter
    public int getNumeroItemFaturado() {
        return numeroItemFaturado;
    }

    public void setNumeroItemFaturado(int numeroItemFaturado) {
        this.numeroItemFaturado = numeroItemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdeCompradaItem() {
        return qtdeCompradaItem;
    }

    public void setQtdeCompradaItem(int qtdeCompradaItem) {
        this.qtdeCompradaItem = qtdeCompradaItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }
}
