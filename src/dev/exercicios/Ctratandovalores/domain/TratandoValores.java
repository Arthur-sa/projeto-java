package dev.exercicios.Ctratandovalores.domain;

public class TratandoValores {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    //imprimir seu valor na tela.
    private final int valorA;
    private final int valorB;
    private int valorC;

    public TratandoValores(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void identificandoValores() {
        if(this.valorA == this.valorB) {
            this.valorC = this.valorA + this.valorB;
        } else {
            this.valorC = this.valorA * this.valorB;
        }
    }

    public int getValorC() {
        return valorC;
    }
}
