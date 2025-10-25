package dev.exercicios.Acomparavalores.domain;

public class ComparaValoresSomados {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

    private final int valorA;
    private final int valorB;
    private final int valorC;

    public ComparaValoresSomados(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public int somaValoresAB() {
        return this.valorA + this.valorB;
    }

    public boolean comparaSomaComValorC() {
        return somaValoresAB() < this.valorC;
    }

}
