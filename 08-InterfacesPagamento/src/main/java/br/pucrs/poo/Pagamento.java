package br.pucrs.poo;

import java.time.LocalDate;

public class Pagamento {
    private FormaDePagamento forma;
    private double valor;
    private String identificadorForma;
    private LocalDate data;

    public Pagamento(FormaDePagamento forma, String identificadorForma, double valor) {
        this.forma = forma;
        this.identificadorForma = identificadorForma;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public FormaDePagamento getForma() {
        return forma;
    }

    public double getValor() {
        return valor;
    }

    public String getIdentificadorForma() {
        return identificadorForma;
    }

    public LocalDate getData() {
        return data;
    }
}
