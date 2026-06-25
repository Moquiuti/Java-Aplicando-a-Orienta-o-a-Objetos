public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoDeLancamento(2009);
        meuFilme.setDuracaoEmMinutos(162);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(7.5);

        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media das avaliacoes: " + meuFilme.pegaMedia());
    }
}

