package dev.exercicios.Fvalorcomreajuste.domain;

public class ValorReajustado {
    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    private static final double PORCENTAGEM_DO_REAJUSTE = 1.05;

    private final double valor;

    public ValorReajustado(double valor) {
        this.valor = valor;
    }

    public double calculaReajuste() {
        return this.valor * PORCENTAGEM_DO_REAJUSTE;
    }
}
