package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila.exercicios;



public class FilaQueAnda {
	int[] data;
	private int fim;

	public FilaQueAnda(int capacidade) {
		data = new int[capacidade];
		fim = 0;
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
		int temp = data[0];
		System.out.println("Removendo elemento:" + temp);
		for (int i = 0; i < fim - 1; i++) {
			data[i] = data[i+1];
		}
		fim--;
		print();	
		return temp;
	}

	private boolean vazia() {
		return fim == 0;
	}

	public void print() {
		System.out.println("***********************************************");
		System.out.println("Fila=[inicio=0, fim=" + fim + "]");
		for (int i = 0; i < fim; i++) {
			System.out.println("Elemento na pos " + i + ", valor:" + data[i]);
		}
		System.out.println(" ");

	}

	public static void main(String[] args) {
		FilaQueAnda f = new FilaQueAnda(5);
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		f.enqueue(5);
		f.dequeue();
		f.dequeue();
		f.dequeue();
		f.dequeue();
		f.dequeue();
	}
}
