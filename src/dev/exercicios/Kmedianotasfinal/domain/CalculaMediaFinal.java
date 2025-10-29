package dev.exercicios.Kmedianotasfinal.domain;

public class CalculaMediaFinal {
    //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    private final String nomeAluno;
    private final float nota1;
    private final float nota2;
    private final float nota3;
    private final float nota4;
    private static final int NUMERO_TOTAL_DE_NOTAS = 4;

    public CalculaMediaFinal(String nomeAluno, float nota1, float nota2, float nota3, float nota4) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public float calculoMediaFinal() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / NUMERO_TOTAL_DE_NOTAS;
    }

    public StatusNotaFinalEnum resultadoMediaFinal() {
        if(calculoMediaFinal() >= 7) {
            return StatusNotaFinalEnum.APROVADO;
        } else {
            return StatusNotaFinalEnum.REPROVADO;
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
}
