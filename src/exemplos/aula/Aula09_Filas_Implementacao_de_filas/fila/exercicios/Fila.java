package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila.exercicios;

public class Fila {
	int[] data;
	private int fim;
	private int inicio;

	public Fila(int capacidade) {
		data = new int[capacidade];
		fim = 0;
		inicio = 0;
	}

	public void enqueue(int i) {
		System.out.println("Inserindo elemento:" + i);
		if (cheia())
			throw new FilaCheiaException("Erro: Tentando inserir na fila cheia...");
		data[fim] = i;
		fim++;
		print();
	}

	private boolean cheia() {
		return fim == data.length;
	}

	public int dequeue() {
		if (vazia())
			throw new FilaVaziaException("Erro: Tentando remover da fila vazia...");
		int temp = data[inicio];
		System.out.println("Removendo elemento:" + temp);
		inicio++;
		print();
		return temp;
	}

	private boolean vazia() {
		return inicio == fim;
	}

	public void print() {
		System.out.println("***********************************************");
		System.out.println("Fila=[inicio=" + inicio + ", fim=" + fim + "]");
		for (int i = inicio; i < fim; i++) {
			System.out.println("Elemento na pos " + i + ", valor:" + data[i]);
		}
		System.out.println(" ");

	}

}
