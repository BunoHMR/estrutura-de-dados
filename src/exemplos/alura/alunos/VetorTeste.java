package exemplos.alura.alunos;

public class VetorTeste {

    public static void main(final String[] args) {
        final Aluno a1 = new Aluno("João");
        final Aluno a2 = new Aluno("Maria");

        final Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
    }
}
