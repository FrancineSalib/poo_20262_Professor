package br.pucrs.poo;

public class App {
    public static void main(String[] args) {
        CartaoDeCredito cc = new CartaoDeCredito();
        Pix pix = new Pix();
        RegistradoraDePagamentos rp = new RegistradoraDePagamentos();
        rp.registraPagamento(cc, "098776453211", 2100.0);
        rp.registraPagamento(pix, "calote@gmail.com", 8000.0);
        rp.registraPagamento(cc, "847598320392", 4398.0);
        rp.registraPagamento(pix, "5187665931", 200.0);

        System.out.println("Total pago:" + rp.totalPago());
    }
}
