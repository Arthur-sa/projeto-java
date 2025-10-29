package dev.exercicios.Jmedianotas.domain;

public class CalculaMediaNotas {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    private final double nota1;
    private final double nota2;
    private final double nota3;
    private static final int NUMERO_DE_NOTAS = 3;

    public CalculaMediaNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculaMediaNotas() {
        return (this.nota1 + this.nota2 + this.nota3) / NUMERO_DE_NOTAS;
    }
}
