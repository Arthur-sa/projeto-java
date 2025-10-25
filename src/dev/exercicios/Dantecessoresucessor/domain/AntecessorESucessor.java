package dev.exercicios.Dantecessoresucessor.domain;

public class AntecessorESucessor {
    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

    private final int numero;

    public AntecessorESucessor(int numero) {
        this.numero = numero;
    }

    public int antecessor() {
        return this.numero - 1;
    }

    public int sucessor() {
        return this.numero + 1;
    }
}
