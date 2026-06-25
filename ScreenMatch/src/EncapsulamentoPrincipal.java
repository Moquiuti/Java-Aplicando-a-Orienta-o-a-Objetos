public class EncapsulamentoPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Leandro";
        conta.setNumeroConta("12345-6");
        conta.setSaldo(1500.0);
        System.out.println("Conta: " + conta.getNumeroConta() + " | Titular: " + conta.titular + " | Saldo: " + conta.getSaldo());

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(17);
        pessoa.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(200.0);
        produto.aplicarDesconto(10);
        System.out.println("Produto: " + produto.getNome() + " | Preco com desconto: " + produto.getPreco());

        Aluno aluno = new Aluno();
        aluno.setNome("Carlos");
        aluno.setNotas(new double[]{8.5, 7.0, 9.0});
        System.out.println("Aluno: " + aluno.getNome() + " | Media: " + aluno.calcularMedia());

        Livro livro = new Livro();
        livro.setTitulo("Clean Code");
        livro.setAutor("Robert C. Martin");
        livro.exibirDetalhes();
    }
}

