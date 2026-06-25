public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int numAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    public double pegaMedia() {
        if (numAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / numAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }
}

