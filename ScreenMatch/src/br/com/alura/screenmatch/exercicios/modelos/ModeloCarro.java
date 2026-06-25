package br.com.alura.screenmatch.exercicios.modelos;

public class ModeloCarro extends Carro {
    private String categoria;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        if (categoria != null && !categoria.isEmpty()) {
            System.out.println("Categoria: " + categoria);
        }
    }
}

