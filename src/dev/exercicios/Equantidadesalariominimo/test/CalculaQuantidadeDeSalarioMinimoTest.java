package dev.exercicios.Equantidadesalariominimo.test;

import dev.exercicios.Equantidadesalariominimo.domain.CalculaQuantidadeDeSalarioMinimo;

public class CalculaQuantidadeDeSalarioMinimoTest {
    public static void main(String[] args) {
        CalculaQuantidadeDeSalarioMinimo salario = new CalculaQuantidadeDeSalarioMinimo(8200);
        System.out.println(salario.calcNumeroSalarioMinimo());
    }
}
