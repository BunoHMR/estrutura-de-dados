package exemplos.aula.Aula07_Busca.Exemplo;

// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
//###############################################################
class ArraySel2 {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    private int MAX;

    //--------------------------------------------------------------
    public ArraySel2(final int max)          // constructor
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
        System.out.println(" ");
    }

    //--------------------------------------------------------------
    public void buscaLinear(final int var) {
        int i;

        for (i = 0; i < MAX - 1; i++)   // outer loop
        {
            if (a[i] == var) {
                System.out.println("Elemento encontrado");  // display it
                return;
            } else System.out.println("Elemento não encontrado");
        }
    }  // end selectionSort()
}  // end class ArraySel

//###############################################################
class BuscaLinearApp {
    public static void main(final String[] args) {
        final int maxSize = 10;            // array size
        final ArraySel2 arr;                 // reference to array
        arr = new ArraySel2(maxSize);  // create the array

        arr.insert(77);               // insert items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items
        arr.buscaLinear(55);          // selection-sort them
        arr.buscaLinear(21);          // selection-sort them
    }  // end main()
}  // end class SelectSortApp

