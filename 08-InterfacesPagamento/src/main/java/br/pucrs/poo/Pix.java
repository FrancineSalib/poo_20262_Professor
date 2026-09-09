package br.pucrs.poo;

public class Pix implements FormaDePagamento {
    @Override
    public boolean pagar(String chavePix, double valor) {
        System.out.println("Consultando o banco central sobre chave PIX: " + chavePix);
        System.out.println("Transferindo valores");
        System.out.println("Pagamento aprovado\n");
        return true;
    }
}
