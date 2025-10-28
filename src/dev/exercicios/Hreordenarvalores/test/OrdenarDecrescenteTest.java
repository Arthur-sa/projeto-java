package dev.exercicios.Hreordenarvalores.test;

import dev.exercicios.Hreordenarvalores.domain.OrdenarDecrescente;

public class OrdenarDecrescenteTest {
    public static void main(String[] args) {
        OrdenarDecrescente ordena = new OrdenarDecrescente(123, 344, 4);
        System.out.println(ordena.ordenarDecrescente());
    }
}
