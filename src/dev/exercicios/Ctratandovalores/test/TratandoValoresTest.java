package dev.exercicios.Ctratandovalores.test;

import dev.exercicios.Ctratandovalores.domain.TratandoValores;

public class TratandoValoresTest {
    public static void main(String[] args) {
        TratandoValores teste = new TratandoValores(4, 4);
        teste.identificandoValores();
        System.out.println(teste.getValorC());
    }
}
