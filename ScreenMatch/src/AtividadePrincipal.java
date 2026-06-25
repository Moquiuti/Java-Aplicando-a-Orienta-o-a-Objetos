public class AtividadePrincipal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();

        Calculadora calculadora = new Calculadora();
        int numero = 7;
        System.out.println("Dobro de " + numero + ": " + calculadora.dobro(numero));

        Musica musica = new Musica();
        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.anoLancamento = 1975;
        musica.avalia(9.5);
        musica.avalia(8.0);
        musica.avalia(10.0);
        musica.exibeFichaTecnica();
        System.out.println("Media das avaliacoes: " + musica.pegaMedia());

        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.ano = 2018;
        carro.cor = "Prata";
        carro.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro.calculaIdade() + " anos");

        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.idade = 19;
        aluno.exibeInformacoes();
    }
}

