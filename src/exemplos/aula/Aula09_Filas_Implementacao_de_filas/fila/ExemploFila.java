package exemplos.aula.Aula09_Filas_Implementacao_de_filas.fila;




public class ExemploFila {
	public static void main(String[] args) {
		Fila f = new Fila(10);
		f.enqueue(10);
		f.print();
		f.enqueue(11);
		f.print();
		f.enqueue(12);
		f.print();
		f.dequeue();
		f.print();
	}

}
