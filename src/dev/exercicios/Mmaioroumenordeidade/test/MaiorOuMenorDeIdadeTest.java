package dev.exercicios.Mmaioroumenordeidade.test;

import dev.exercicios.Mmaioroumenordeidade.domain.MaiorOuMenorDeIdade;

public class MaiorOuMenorDeIdadeTest {
    public static void main(String[] args) {
        MaiorOuMenorDeIdade pessoa1 = new MaiorOuMenorDeIdade("Arthur", 25);
        MaiorOuMenorDeIdade pessoa2 = new MaiorOuMenorDeIdade("Murilo",  12);

        System.out.println("Nome: " +  pessoa1.getNome() + " " + pessoa1.defineMaioridade());
        System.out.println("Nome: " +  pessoa2.getNome() + " " + pessoa2.defineMaioridade());
    }
}
