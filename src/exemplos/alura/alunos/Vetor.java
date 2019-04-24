package exemplos.alura.alunos;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int total = 0;
	
	private void moreSpace() {
		if (total == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
		this.alunos = novoArray;
		}
	}

	// adicionar aluno
	public void add(Aluno aluno) {
		this.moreSpace();
		this.alunos[total] = aluno;
		total++;

	}

	public void add(Aluno aluno, Integer posicao) {
		this.moreSpace();
		if (!(posicao >= 0) && !(posicao <= total)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for (int i = total - 1; i >= posicao ; --i ) {
			System.out.println(i);
			alunos[i+1] = alunos[i];			
		}
		alunos[posicao] = aluno;
		total++;
	}

	// pega um aluno
	public Aluno get(int index) {
		if (index > total || index < 0) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return alunos[index];
	}


	// remove um aluno baseado no index
	public void remove(int posicao) {
		for ( int i = posicao; i < total; i++) {
			this.alunos[i] = alunos[i+1];
		}
		this.alunos[total] = null;
		total--;
	}
	

	// descobre se o aluno esta contido na lista
	public boolean contains(final Aluno aluno) {
		for (Aluno unicoAluno : alunos) {
			if (unicoAluno == aluno) {
				return true;
			}
		}
		return false;
	}
	
	// devolve a quantidade de alunos
	public int length() {
		return total;
	}

	// facilita na impressão da lista
	public String toString() {
		return Arrays.toString(alunos);
	}

}
