package dev.exercicios.Bidentificanumero.test;

import dev.exercicios.Bidentificanumero.domain.TipoDeNumero;

public class TipoDeNumeroTest {
    public static void main(String[] args) {
        TipoDeNumero numero = new TipoDeNumero(-4);
        System.out.println(numero.identificaNumero());
    }
}
