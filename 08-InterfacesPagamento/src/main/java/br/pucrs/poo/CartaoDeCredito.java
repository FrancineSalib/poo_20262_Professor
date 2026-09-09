package br.pucrs.poo;

public class CartaoDeCredito implements FormaDePagamento {
    @Override
    public boolean pagar(String numeroDoCartao,double valor) {
        System.out.println("Consultando o banco emissor do cartão: "+numeroDoCartao);
        System.out.println("Pagamento aprovado\n");
        return true;
    }
}
