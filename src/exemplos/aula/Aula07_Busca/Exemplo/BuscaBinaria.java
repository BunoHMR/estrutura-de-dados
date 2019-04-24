package exemplos.aula.Aula07_Busca.Exemplo;

class ArraySel {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    private int MAX;

    //--------------------------------------------------------------
    public ArraySel(final int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
        MAX = max;
    }

    //--------------------------------------------------------------
    public void insert(final long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    //--------------------------------------------------------------
    public void display()             // displays array contents
    {

        for (int j = 0; j < MAX; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

    //--------------------------------------------------------------
    public void buscaBinaria(final int var) {
        int i, esq, dir;

        for (i = 0, esq = 0, dir = MAX - 1; esq <= (dir - 1); i++) {
            final int cen = (dir - esq) / 2;
            if (a[cen] == var) {
                System.out.println("Elemento encontrado");  // display it
                return;
            }
            //--------------------------------------------------------------
            if (a[cen] < var) dir = cen;
            else esq = cen;
        }
        System.out.println("Elemento n�o encontrado");  // display it
    }

}  // end class ArraySel

//###############################################################
class buscaBinariaApp {
    public static void main(final String[] args) {
        final int maxSize = 11;            // array size
        final ArraySel arr;                 // reference to array
        arr = new ArraySel(maxSize);  // create the array

        arr.insert(00);              // insert items
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        arr.insert(100);

        arr.display();                // display items
        arr.buscaBinaria(99);          // selection-sort them
        arr.buscaBinaria(21);          // selection-sort them
    }  // end main()
}  // end class SelectSortApp

