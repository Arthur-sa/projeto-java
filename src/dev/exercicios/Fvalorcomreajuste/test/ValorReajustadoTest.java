package dev.exercicios.Fvalorcomreajuste.test;

import dev.exercicios.Fvalorcomreajuste.domain.ValorReajustado;

public class ValorReajustadoTest {
    public static void main(String[] args) {
        ValorReajustado valor = new ValorReajustado(100);
        System.out.println("Valor com reajuste de 5%: " + valor.calculaReajuste());
    }
}
