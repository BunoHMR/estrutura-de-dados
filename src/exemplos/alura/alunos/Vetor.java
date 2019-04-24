package exemplos.alura.alunos;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];

    public void adiciona(final Aluno aluno) {
        //recebe um aluno
    }

    public Aluno get(final int index) {
        //recebe uma posição e devolve um aluno
        return null;
    }

    public void remove(final int index) {
        //remove um aluno baseado no index
    }

    public boolean contains(final Aluno aluno) {
        // descobre se o aluno esta contido na lista
        return false;
    }

    public int length() {
        // devolve a quantidade de alunos
        return 0;
    }

    public String toString() {
        //facilita na impressão da lista
        return Arrays.toString(alunos);
    }

}
