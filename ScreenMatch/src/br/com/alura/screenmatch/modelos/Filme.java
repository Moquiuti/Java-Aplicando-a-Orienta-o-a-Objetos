package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    private String diretor;

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        if (diretor != null && !diretor.isEmpty()) {
            System.out.println("Diretor: " + diretor);
        }
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

