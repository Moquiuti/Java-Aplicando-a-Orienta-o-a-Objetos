package br.com.alura.screenmatch.exercicios.modelos;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " e primo.");
        } else {
            System.out.println(numero + " nao e primo.");
        }
    }
}

