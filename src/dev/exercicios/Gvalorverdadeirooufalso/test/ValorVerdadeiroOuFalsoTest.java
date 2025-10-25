package dev.exercicios.Gvalorverdadeirooufalso.test;

import dev.exercicios.Gvalorverdadeirooufalso.domain.ValorVerdadeiroOuFalso;

public class ValorVerdadeiroOuFalsoTest {
    public static void main(String[] args) {
        ValorVerdadeiroOuFalso valor = new ValorVerdadeiroOuFalso(true, true);
        System.out.println(valor.tipoValor());
    }
}
