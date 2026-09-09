package br.pucrs.poo;

public interface IPilha<T> {
    void Empilhar(T val);

    T Desempilhar();

    T Topo();

    Boolean Vazia();
}
