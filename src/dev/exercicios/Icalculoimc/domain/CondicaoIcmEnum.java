package dev.exercicios.Icalculoimc.domain;

public enum CondicaoIcmEnum {
    //Abaixo de 18,5   | Abaixo do peso
    //
    // Entre 18,6 e 24,9 | Peso ideal (parabéns)
    //
    // Entre 25,0 e 29,9 | Levemente acima do peso
    //
    // Entre 30,0 e 34,9 | Obesidade grau I
    //
    // Entre 35,0 e 39,9 | Obesidade grau II (severa)
    //
    // Maior ou igual a 40 | Obesidade grau III (mórbida)

    ABAIXO_DO_PESO,
    PESO_IDEAL,
    LEVEMENTE_ACIMA_DO_PESO,
    OBESIDADE_GRAU_I,
    OBESIDADE_GRAU_II,
    OBESIDADE_GRAU_III

}
