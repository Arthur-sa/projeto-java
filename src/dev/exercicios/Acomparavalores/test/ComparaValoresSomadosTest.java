package dev.exercicios.Acomparavalores.test;

import dev.exercicios.Acomparavalores.domain.ComparaValoresSomados;

public class ComparaValoresSomadosTest {
    public static void main(String[] args) {
        ComparaValoresSomados teste = new ComparaValoresSomados(3, 4, 7);
        if(teste.comparaSomaComValorC()) {
            System.out.println("A soma do valorA + valorB é menor que o valor C");
        } else {
            System.out.println("A soma do valorA + valorB não é menor que o valor C");
        }
    }
}
