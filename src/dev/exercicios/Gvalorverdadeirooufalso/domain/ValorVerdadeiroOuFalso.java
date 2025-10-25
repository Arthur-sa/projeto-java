package dev.exercicios.Gvalorverdadeirooufalso.domain;

public class ValorVerdadeiroOuFalso {
    //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    private final boolean valor1;
    private final boolean valor2;

    public ValorVerdadeiroOuFalso(boolean valor1, boolean valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public ValorVerdadeiroOuFalsoEnum tipoValor() {
        if(this.valor1 && this.valor2) {
            return ValorVerdadeiroOuFalsoEnum.VERDADEIRO;
        } else if(!this.valor1 && !this.valor2) {
            return ValorVerdadeiroOuFalsoEnum.FALSO;
        } else {
            return ValorVerdadeiroOuFalsoEnum.DIFERENTES;
        }
    }
}
