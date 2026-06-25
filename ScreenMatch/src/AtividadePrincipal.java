public class AtividadePrincipal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();

        Calculadora calculadora = new Calculadora();
        int numero = 7;
        System.out.println("Dobro de " + numero + ": " + calculadora.dobro(numero));

        Musica musica = new Musica();
        musica.setTitulo("Bohemian Rhapsody");
        musica.setArtista("Queen");
        musica.setAnoLancamento(1975);
        musica.avalia(9.5);
        musica.avalia(8.0);
        musica.avalia(10.0);
        musica.exibeFichaTecnica();
        System.out.println("Media das avaliacoes: " + musica.pegaMedia());

        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setAno(2018);
        carro.setCor("Prata");
        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.calculaIdade() + " anos");

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setIdade(19);
        aluno.exibeInformacoes();
    }
}

