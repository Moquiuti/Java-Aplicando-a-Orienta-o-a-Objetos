public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Avatar";
        meuFilme.anoDeLancamento = 2009;
        meuFilme.duracaoEmMinutos = 162;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(7.5);

        System.out.println("Total de avaliacoes: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Media das avaliacoes: " + meuFilme.pegaMedia());
    }
}

