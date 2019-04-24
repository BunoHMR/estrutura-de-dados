package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila;


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
		data[fim] = i;
		fim++;
	}

	public int dequeue() {
		int temp = data[inicio];
		System.out.println("Removendo elemento:" + temp);
		inicio++;
		return temp;
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
