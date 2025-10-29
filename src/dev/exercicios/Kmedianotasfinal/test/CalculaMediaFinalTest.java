package dev.exercicios.Kmedianotasfinal.test;

import dev.exercicios.Kmedianotasfinal.domain.CalculaMediaFinal;

public class CalculaMediaFinalTest {
    public static void main(String[] args) {
        CalculaMediaFinal aluno = new CalculaMediaFinal("Arthur", 5.8f, 8.5f, 7.4f, 6.8f);
        System.out.println("O aluno " + aluno.getNomeAluno() + " foi " + aluno.resultadoMediaFinal());
    }
}
