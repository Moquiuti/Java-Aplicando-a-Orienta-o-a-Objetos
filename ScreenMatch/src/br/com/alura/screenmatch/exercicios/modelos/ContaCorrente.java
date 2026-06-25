package br.com.alura.screenmatch.exercicios.modelos;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifa) {
        sacar(tarifa);
    }
}

