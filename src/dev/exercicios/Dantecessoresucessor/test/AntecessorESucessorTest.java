package dev.exercicios.Dantecessoresucessor.test;

import dev.exercicios.Dantecessoresucessor.domain.AntecessorESucessor;

public class AntecessorESucessorTest {
    public static void main(String[] args) {
        AntecessorESucessor numero = new AntecessorESucessor(5);
        System.out.println(numero.antecessor() + " " + numero.sucessor());
    }
}
