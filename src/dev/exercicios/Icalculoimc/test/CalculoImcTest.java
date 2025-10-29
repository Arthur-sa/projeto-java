package dev.exercicios.Icalculoimc.test;

import dev.exercicios.Icalculoimc.domain.CalculoImc;

public class CalculoImcTest {
    public static void main(String[] args) {
        CalculoImc pessoa = new CalculoImc(99.5, 1.85);
        System.out.println(pessoa.condicaoPessoa());
        System.out.println(pessoa.calculaImc());
    }
}
