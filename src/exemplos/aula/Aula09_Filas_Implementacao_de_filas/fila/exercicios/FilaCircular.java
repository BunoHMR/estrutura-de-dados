package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila.exercicios;

public class FilaCircular {
	int[] data;
	private int tamanho;
	private int inicio;

	public int capacidade() {
		return data.length;
	}

	public FilaCircular(int capacidade) {
		data = new int[capacidade];
		tamanho = 0;
		inicio = 0;
	}

	public void enqueue(int i) {
		System.out.println("Inserindo elemento:" + i);
		if (cheia())
			throw new FilaCheiaException(
					"Erro: Tentando inserir na fila cheia...");
		int fim = (inicio + tamanho) % capacidade();
		data[fim] = i;
		tamanho++;
		print();
	}

	private boolean cheia() {
		return tamanho == capacidade();
	}

	public int dequeue() {
		if (vazia())
			throw new FilaVaziaException(
					"Erro: Tentando remover da fila vazia...");
		int temp = data[inicio];
		System.out.println("Removendo elemento:" + temp);
		inicio = (inicio + 1) % capacidade();
		tamanho--;
		print();
		return temp;
	}

	private boolean vazia() {
		return tamanho == 0;
	}

	public void print() {
		System.out.println("***********************************************");
		int fim = (inicio + tamanho) % capacidade();
		System.out.println("Fila=[inicio=" + inicio + ", fim=" + fim + "]");
		if (fim > inicio)
			for (int i = inicio; i < fim; i++)
				print(i);
		else {
			for (int i = inicio; i < data.length; i++)
				print(i);
			for (int i = 0; i < fim; i++)
				print(i);
		}
		System.out.println(" ");

	}

	private void print(int i) {
		System.out.println("Elemento na pos " + i + ", valor:" + data[i]);
	}

}
