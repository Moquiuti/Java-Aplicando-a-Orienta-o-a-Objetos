# ScreenMatch

Projeto Java simples para praticar Orientacao a Objetos com classes basicas de modelagem e classes principais para execucao.

## Estrutura

- `src/Filme.java`
- `src/Principal.java`
- `src/Pessoa.java`
- `src/Calculadora.java`
- `src/Musica.java`
- `src/Carro.java`
- `src/Aluno.java`
- `src/AtividadePrincipal.java`
- `src/ContaBancaria.java`
- `src/IdadePessoa.java`
- `src/Produto.java`
- `src/Livro.java`
- `src/EncapsulamentoPrincipal.java`
- `src/br/com/alura/screenmatch/modelos/Titulo.java`
- `src/br/com/alura/screenmatch/modelos/Filme.java`
- `src/br/com/alura/screenmatch/modelos/Serie.java`
- `src/br/com/alura/screenmatch/calculos/CalculadoraDeTempo.java`
- `src/br/com/alura/screenmatch/principal/Principal.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/Carro.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/ModeloCarro.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/Animal.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/Cachorro.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/Gato.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/ContaBancaria.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/ContaCorrente.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/NumerosPrimos.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/VerificadorPrimo.java`
- `src/br/com/alura/screenmatch/exercicios/modelos/GeradorPrimo.java`
- `src/br/com/alura/screenmatch/exercicios/principal/PrincipalExerciciosHeranca.java`

## Como executar (PowerShell)

```powershell
$fontes = Get-ChildItem -Path "src" -Recurse -Filter "*.java" | ForEach-Object { $_.FullName }
javac -d out $fontes
java -cp out Principal
java -cp out AtividadePrincipal
java -cp out EncapsulamentoPrincipal
java -cp out br.com.alura.screenmatch.principal.Principal
java -cp out br.com.alura.screenmatch.exercicios.principal.PrincipalExerciciosHeranca
```

