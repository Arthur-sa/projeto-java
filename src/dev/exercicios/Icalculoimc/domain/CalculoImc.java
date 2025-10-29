package dev.exercicios.Icalculoimc.domain;

public class CalculoImc {
    //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição.
    //Fórmula do IMC = peso / (altura) ²
    private final double peso;
    private final double altura;

    public CalculoImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaImc() {
        return this.peso / (this.altura * this.altura);
    }

    public CondicaoIcmEnum condicaoPessoa() {
        return switch (calculaImc()) {
            case double imc when imc <= 18.5 -> CondicaoIcmEnum.ABAIXO_DO_PESO;
            case double imc when imc <= 24.9 -> CondicaoIcmEnum.PESO_IDEAL;
            case double imc when imc <= 29.9 -> CondicaoIcmEnum.LEVEMENTE_ACIMA_DO_PESO;
            case double imc when imc <= 34.9 -> CondicaoIcmEnum.OBESIDADE_GRAU_I;
            case double imc when imc <= 39.9 -> CondicaoIcmEnum.OBESIDADE_GRAU_II;
            default -> CondicaoIcmEnum.OBESIDADE_GRAU_III;
        };
    }
}
