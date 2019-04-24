package exemplos.aula.Aula05_Listas_Encadeada.Exemplo;

// Demonstração de lista circular

class arrayCircular {
    private static final int TAM_MAX = 7;
    private static int inicioLista, qtdElementos, posVaga;
    private static int[] arrayCircular;

    //===============================================================
    arrayCircular() {
        arrayCircular = new int[TAM_MAX];
        inicioLista = 0;
        qtdElementos = 0;
        posVaga = 0;
    }

    //-------------------------------------------------------------
    void displayArray() {
        System.out.println(" ");
        for (int j = 0, i = inicioLista; j < qtdElementos; j++) {
            displayArray(i);
            System.out.println(" ");
            i++;
            if (i >= TAM_MAX) i = 0;
        }
        System.out.println(" ");
    }

    private void displayArray(final int j) {
        System.out.print("Elemento " + j + arrayCircular[j]);
    }

    //-------------------------------------------------------------
    void inserElemento(final int var) {
        if (qtdElementos == TAM_MAX) {
            System.out.print("<< Opera��o negada.  Lista cheia>>");
            return;
        }

        arrayCircular[posVaga] = var;
        qtdElementos++;

        posVaga++;
        if (posVaga >= TAM_MAX) posVaga = 0;
    }

    //-------------------------------------------------------------
    void removerElemento() {
        if (qtdElementos == 0) {
            System.out.print("<< Opera��o negada.  Lista vazia>>");
            return;
        }

        qtdElementos--;
        inicioLista++;
        if (inicioLista >= TAM_MAX) inicioLista = 0;
    }

    //-------------------------------------------------------------
    void esvaziarArray() {
        inicioLista = 0;
        qtdElementos = 0;
        posVaga = 0;
        System.out.println("<< Opera��o realizada.  Lista vazia>>");
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
