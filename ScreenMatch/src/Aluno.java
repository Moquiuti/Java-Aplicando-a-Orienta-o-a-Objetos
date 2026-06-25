import java.util.Arrays;

public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        if (notas == null) {
            return new double[0];
        }
        return Arrays.copyOf(notas, notas.length);
    }

    public void setNotas(double[] notas) {
        this.notas = Arrays.copyOf(notas, notas.length);
    }

    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

