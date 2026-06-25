package br.com.alura.screenmatch.exercicios.principal;

import br.com.alura.screenmatch.exercicios.modelos.Animal;
import br.com.alura.screenmatch.exercicios.modelos.Carro;
import br.com.alura.screenmatch.exercicios.modelos.Cachorro;
import br.com.alura.screenmatch.exercicios.modelos.ContaBancaria;
import br.com.alura.screenmatch.exercicios.modelos.ContaCorrente;
import br.com.alura.screenmatch.exercicios.modelos.Gato;
import br.com.alura.screenmatch.exercicios.modelos.GeradorPrimo;
import br.com.alura.screenmatch.exercicios.modelos.ModeloCarro;
import br.com.alura.screenmatch.exercicios.modelos.NumerosPrimos;
import br.com.alura.screenmatch.exercicios.modelos.VerificadorPrimo;

public class PrincipalExerciciosHeranca {
    public static void main(String[] args) {
        carroPolimorfismo();
        animaisPolimorfismo();
        contaCorrenteExemplo();
        primosExemplo();
    }

    private static void carroPolimorfismo() {
        System.out.println("--- Carro ---");
        Carro carro = new ModeloCarro();
        carro.setNomeModelo("Sedan LX");
        carro.setPrecosMedios(98000, 94000, 91000);
        if (carro instanceof ModeloCarro) {
            ((ModeloCarro) carro).setCategoria("Sedan");
        }
        carro.exibirInformacoes();

        ModeloCarro modelo = new ModeloCarro();
        modelo.setNomeModelo("Hatch Sport");
        modelo.setPrecosMedios(89000, 86000, 83000);
        modelo.setCategoria("Hatch");
        modelo.exibirInformacoes();
    }

    private static void animaisPolimorfismo() {
        System.out.println();
        System.out.println("--- Animais ---");
        Animal[] animais = {new Cachorro(), new Gato()};

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.arranharMoveis();
    }

    private static void contaCorrenteExemplo() {
        System.out.println();
        System.out.println("--- Conta corrente ---");
        ContaBancaria conta = new ContaCorrente();
        conta.depositar(1000);
        conta.sacar(150);
        System.out.println("Saldo apos operacoes: " + conta.consultarSaldo());

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000);
        contaCorrente.cobrarTarifaMensal(25);
        System.out.println("Saldo apos tarifa mensal: " + contaCorrente.consultarSaldo());
    }

    private static void primosExemplo() {
        System.out.println();
        System.out.println("--- Numeros primos ---");
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(29);
        verificador.verificarSeEhPrimo(30);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximo = gerador.gerarProximoPrimo(30);
        System.out.println("Proximo primo apos 30: " + proximo);
    }
}


