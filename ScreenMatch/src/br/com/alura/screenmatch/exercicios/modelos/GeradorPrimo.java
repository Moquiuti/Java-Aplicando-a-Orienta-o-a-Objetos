package br.com.alura.screenmatch.exercicios.modelos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numeroBase) {
        int candidato = numeroBase + 1;
        while (!verificarPrimalidade(candidato)) {
            candidato++;
        }
        return candidato;
    }
}

