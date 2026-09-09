package br.pucrs.poo;

import java.util.LinkedList;
import java.util.List;

public class RegistradoraDePagamentos {
    private List<Pagamento> pagamentos;

    public RegistradoraDePagamentos(){
        pagamentos = new LinkedList<>();
    }

    public void registraPagamento(FormaDePagamento forma,String identificador,double valor){
        if (forma.pagar(identificador,valor)){
        pagamentos.add(new Pagamento(forma, identificador, valor));
        }else{
            throw new IllegalStateException("Pagamento recusado");
        }
    }

    public int qtdadePagamentos(){
        return pagamentos.size();
    }

    public double totalPago(){
        int soma = 0;
        for(Pagamento pagamento:pagamentos){
            soma += pagamento.getValor();
        }
        return soma;
    }

    /*
    // Para mais adiante
    public double totalPago(FormaDePagamento formaDePagamento){
        double soma = 0.0;
        for(Pagamento pagamento:pagamentos){
            if (pagamento.getForma() instanceof FormaDePagamento){
                soma += pagamento.getValor();
            }
        }
        return soma;
    }
    */
}
