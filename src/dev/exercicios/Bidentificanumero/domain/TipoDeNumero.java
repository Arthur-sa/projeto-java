package dev.exercicios.Bidentificanumero.domain;

public class TipoDeNumero {
    private final int numero;

    public TipoDeNumero(int numero) {
        this.numero = numero;
    }

    public TipoDeNumeroEnum identificaNumero() {
        if(this.numero % 2 == 0) {
            if(this.numero >= 0) {
                return TipoDeNumeroEnum.PAR_POSITIVO;
            } else {
                return TipoDeNumeroEnum.PAR_NEGATIVO;
            }
        } else {
            if(this.numero >= 0) {
                return TipoDeNumeroEnum.IMPAR_POSITIVO;
            } else {
                return TipoDeNumeroEnum.IMPAR_NEGATIVO;
            }
        }
    }
}
