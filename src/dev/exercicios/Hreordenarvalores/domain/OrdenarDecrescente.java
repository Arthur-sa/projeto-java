package dev.exercicios.Hreordenarvalores.domain;

public class OrdenarDecrescente {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    private final int valor1;
    private final int valor2;
    private final int valor3;

    public OrdenarDecrescente(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public String ordenarDecrescente() {
        if(this.valor1 > this.valor2 && this.valor1 > this.valor3) {
            if(this.valor2 > valor3) {
                return String.valueOf(this.valor1 + " " + this.valor2 + " " + this.valor3);
            } else {
                return String.valueOf(this.valor1 + " " + this.valor3 + " " + this.valor2);
            }
        } else if(this.valor2 > this.valor1 && this.valor2 > this.valor3) {
            if (this.valor1 > this.valor3) {
                return String.valueOf(this.valor2 + " " + this.valor1 + " " + this.valor3);
            } else {
                return String.valueOf(this.valor2 + " " + this.valor3 + " " + this.valor1);
            }
        } else {
            if(this.valor1 > this.valor2) {
                return String.valueOf(this.valor3 + " " + this.valor1 + " " + this.valor2);
            } else {
                return String.valueOf(this.valor3 + " " + this.valor2 + " " + this.valor1);
            }
        }
    }
}
