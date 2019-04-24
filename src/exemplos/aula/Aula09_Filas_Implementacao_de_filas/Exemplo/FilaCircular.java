package exemplos.aula.Aula09_Filas_Implementacao_de_filas.Exemplo;

// demostra��o de lista circular
// to run this program: C>java listaCircular
//##############################################################
class arrayCircular {
    static final int TAM_MAX = 7;
    static int inicioLista, qtdElementos, posVaga;
    static int[] vetorCircular;

    //===============================================================
    public arrayCircular() {
        vetorCircular = new int[TAM_MAX];
        inicioLista = 0;
        qtdElementos = 0;
        posVaga = 0;
    }

    //-------------------------------------------------------------
    public void displayArray() {
        System.out.println(" ");
        for (int j = 0, i = inicioLista; j < qtdElementos; j++) {
            displayArray(i);
            System.out.println(" ");
            i++;
            if (i >= TAM_MAX) i = 0;
        }
        System.out.println(" ");
    }

    public void displayArray(final int j) {
        System.out.print("Elemento " + j + vetorCircular[j]);
    }

    //-------------------------------------------------------------
    public void inserElemento(final int var) {
        if (qtdElementos == TAM_MAX) {
            System.out.print("<< Operacao negada.  Lista cheia>>");
            return;
        }

        vetorCircular[posVaga] = var;
        qtdElementos++;

        posVaga++;
        if (posVaga >= TAM_MAX) posVaga = 0;
    }

    //-------------------------------------------------------------
    public void removerElemento() {
        if (qtdElementos == 0) {
            System.out.print("<< Operacao negada.  Lista vazia>>");
            return;
        }

        qtdElementos--;
        inicioLista++;
        if (inicioLista >= TAM_MAX) inicioLista = 0;
    }

    //-------------------------------------------------------------
    public void esvaziarArray() {
        inicioLista = 0;
        qtdElementos = 0;
        posVaga = 0;
        System.out.println("<< Operacao realizada.  Lista vazia>>");
    }
}

//##############################################################
class listaCircular {
    public static void main(final String[] args) {
        final arrayCircular array = new arrayCircular();

        //primeiro analise
        array.esvaziarArray();
        array.inserElemento(8);
        array.displayArray();
        array.inserElemento(2);
        array.displayArray();
        array.inserElemento(5);
        array.displayArray();
        array.inserElemento(3);
        array.displayArray();
        array.inserElemento(1);
        array.displayArray();
        array.inserElemento(9);
        array.displayArray();
        array.inserElemento(4);
        array.displayArray();
        array.inserElemento(10);
        array.displayArray();

        //segunda analise
        array.esvaziarArray();
        array.inserElemento(8);
        array.displayArray();
        array.inserElemento(2);
        array.displayArray();
        array.inserElemento(5);
        array.displayArray();
        array.inserElemento(3);
        array.displayArray();
        array.removerElemento();
        array.displayArray();
        array.removerElemento();
        array.displayArray();

        //terceira analise
        array.esvaziarArray();
        array.inserElemento(8);
        array.displayArray();
        array.inserElemento(2);
        array.displayArray();
        array.inserElemento(5);
        array.displayArray();
        array.inserElemento(3);
        array.displayArray();
        array.inserElemento(1);
        array.displayArray();
        array.inserElemento(9);
        array.displayArray();
        array.removerElemento();
        array.displayArray();
        array.removerElemento();
        array.displayArray();
        array.inserElemento(10);
        array.displayArray();
    }
}
