package dev.exercicios.Mmaioroumenordeidade.domain;

public class MaiorOuMenorDeIdade {
    //13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    private final String nome;
    private final int idade;

    public MaiorOuMenorDeIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public DefineMaioridadeEnum defineMaioridade() {
        if(this.idade >= 18) {
            return DefineMaioridadeEnum.MAIOR_DE_IDADE;
        } else {
            return DefineMaioridadeEnum.MENOR_DE_IDADE;
        }
    }

    public String getNome() {
        return nome;
    }
}
