package br.com.digitalhouse.Exercicio02;

import java.util.ArrayList;

public class Fatura {
    private ArrayList<Itens>  listaItens= new ArrayList<>();

    public Fatura(){

    }

    public void cadastraItens(Itens itens){

        listaItens.add(itens);
    }

    public double getTotalFatura(){

        double valorTotalFatura = 0.0d;
        double valorTotalItem = 0.0d;

        for(int posicao = 0;posicao < listaItens.size();posicao++){

            valorTotalItem = listaItens.get(posicao).getQtdeCompradaItem() *
                             listaItens.get(posicao).getPrecoUnitarioItem();

            System.out.println("Valor total do item: " + listaItens.get(posicao).getDescricaoItem() +
                               ": " + valorTotalItem);

            valorTotalFatura = valorTotalFatura + valorTotalItem;

        }
        System.out.println("Valor total da fatura: " + valorTotalFatura);
        return valorTotalFatura;
    }
}
