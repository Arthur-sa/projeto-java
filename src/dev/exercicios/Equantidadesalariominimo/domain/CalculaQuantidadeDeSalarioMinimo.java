package dev.exercicios.Equantidadesalariominimo.domain;

public class CalculaQuantidadeDeSalarioMinimo {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.518,00).
    private static final double SALARIO_MINIMO = 1518.20;

    private final double salarioUsuario;

    public CalculaQuantidadeDeSalarioMinimo(double salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }

    public double calcNumeroSalarioMinimo() {
        return this.salarioUsuario / SALARIO_MINIMO;
    }
}
