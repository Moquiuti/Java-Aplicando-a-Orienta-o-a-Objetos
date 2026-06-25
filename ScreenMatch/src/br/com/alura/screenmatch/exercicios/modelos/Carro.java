package br.com.alura.screenmatch.exercicios.modelos;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecosMedios(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenorPreco() {
        double menor = precoAno1;
        if (precoAno2 < menor) {
            menor = precoAno2;
        }
        if (precoAno3 < menor) {
            menor = precoAno3;
        }
        return menor;
    }

    public double calcularMaiorPreco() {
        double maior = precoAno1;
        if (precoAno2 > maior) {
            maior = precoAno2;
        }
        if (precoAno3 > maior) {
            maior = precoAno3;
        }
        return maior;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preco medio ano 1: " + precoAno1);
        System.out.println("Preco medio ano 2: " + precoAno2);
        System.out.println("Preco medio ano 3: " + precoAno3);
        System.out.println("Menor preco: " + calcularMenorPreco());
        System.out.println("Maior preco: " + calcularMaiorPreco());
    }
}

