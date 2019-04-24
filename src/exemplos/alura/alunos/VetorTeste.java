package exemplos.alura.alunos;

public class VetorTeste {

    public static void main(final String[] args) {
        final Aluno a1 = new Aluno("Joao");
        final Aluno a2 = new Aluno("Maria");
        final Aluno a3 = new Aluno("Danilo");
        final Aluno a4 = new Aluno("Marcio");
        final Aluno a5 = new Aluno("Phill");

        final Vetor lista = new Vetor();

        System.out.println(lista.length());
        lista.add(a1);
        System.out.println(lista.length());
        lista.add(a2);
        System.out.println(lista.length());
        lista.add(a3);
        System.out.println(lista.length());
        lista.add(a4);
        System.out.println(lista.length());

        System.out.println(lista);

        System.out.println(lista.contains(a1));

        System.out.println(lista.contains(a3));

        //listar a pessoa na posicao
        System.out.println(lista.get(2));

        lista.add(a5);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);
    }
}
