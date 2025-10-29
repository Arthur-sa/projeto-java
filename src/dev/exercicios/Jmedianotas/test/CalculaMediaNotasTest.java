package dev.exercicios.Jmedianotas.test;

import dev.exercicios.Jmedianotas.domain.CalculaMediaNotas;

public class CalculaMediaNotasTest {
    public static void main(String[] args) {
        CalculaMediaNotas aluno = new CalculaMediaNotas(7.23, 8.20, 6.0);
        System.out.println("Média das notas tiradas: " + aluno.calculaMediaNotas());
    }
}
