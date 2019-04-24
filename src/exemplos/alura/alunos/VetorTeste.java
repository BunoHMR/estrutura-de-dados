package exemplos.alura.alunos;;

public class VetorTeste {

    public static void main(final String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Danilo");
        Aluno a4 = new Aluno("Marcio");
        Aluno a5 = new Aluno("Phill");

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
        
        
        lista.add(a5, 2);
        System.out.println(lista);
        
        lista.remove(1);
        System.out.println(lista);
    }
}
