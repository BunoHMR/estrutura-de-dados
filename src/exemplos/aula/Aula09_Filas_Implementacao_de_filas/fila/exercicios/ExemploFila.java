package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila.exercicios;


public class ExemploFila {
	public static void main(String[] args) {
		Fila f = new Fila(10);
		f.enqueue(5);
		f.enqueue(3);
		f.dequeue();
		f.enqueue(2);
		f.enqueue(8);
	}

}
