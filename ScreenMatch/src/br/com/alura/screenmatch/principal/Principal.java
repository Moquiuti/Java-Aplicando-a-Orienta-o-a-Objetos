package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.setDiretor("Lana e Lilly Wachowski");
        favorito.avalia(9.5);
        favorito.avalia(9.0);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);
        outro.setDiretor("Chad Stahelski");
        outro.avalia(8.4);
        outro.avalia(8.8);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(false);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);
        serie.avalia(8.7);
        serie.avalia(9.1);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        favorito.exibeFichaTecnica();
        System.out.println("Media de avaliacoes: " + favorito.pegaMedia());
        System.out.println();

        serie.exibeFichaTecnica();
        System.out.println("Media de avaliacoes: " + serie.pegaMedia());
        System.out.println();

        System.out.println("Tempo total para maratonar: " + calculadora.getTempoTotal() + " minutos");
    }
}

