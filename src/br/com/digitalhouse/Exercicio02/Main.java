package br.com.digitalhouse.Exercicio02;

public class Main {

    public static void main(String[] args) {

        Itens item01 = new Itens(1,"Papel",5,10.0d);

        Fatura fatura = new Fatura();
        fatura.cadastraItens(item01);

        System.out.println("Detalhe da Fatura: ");

        System.out.println("Numero do item: " + item01.getNumeroItemFaturado() + "\r\n" +
                           "Descrição do item:  " + item01.getDescricaoItem() + "\r\n" +
                           "Quantidade comprada do item: " + item01.getQtdeCompradaItem() + "\r\n" +
                           "Preço unitário do item: " + item01.getPrecoUnitarioItem());

        Itens item02 = new Itens(2,"Tesoura",2,22.0d);

        fatura.cadastraItens(item02);

        System.out.println("Numero do item: " + item02.getNumeroItemFaturado() + "\r\n" +
                            "Descrição do item:  " + item02.getDescricaoItem() + "\r\n" +
                             "Quantidade comprada do item: " + item02.getQtdeCompradaItem() + "\r\n" +
                             "Preço unitário do item: " + item02.getPrecoUnitarioItem());

        fatura.getTotalFatura();
    }
}
