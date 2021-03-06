package exemplos.aula.Aula06_Ordenacao.Exemplo;

// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
//###############################################################
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
    public void display() {                 // displays array contents
        for (int j = 0; j < MAX; j++)       // for each element,
            System.out.print(a[j] + " ");   // display it
        System.out.println(" ");
    }

    //--------------------------------------------------------------
    public void selectionSort() {
        int i, j, min;

        for (i = 0; i < MAX - 1; i++)   // outer loop
        {
            min = i;                     // minimum
            for (j = i + 1; j < MAX; j++) // inner loop
            {
                if (a[i] < a[j]) min = i;
            }
            swap(i, min);                // swap them
        }  // end for(out)
    }  // end selectionSort()

    //--------------------------------------------------------------
    private void swap(final int one, final int two) {
        final long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}  // end class ArraySel

//###############################################################
class SelectSortApp {
    public static void main(final String[] args) {
        final int maxSize = 10;            // array size
        final ArraySel arr;                 // reference to array
        arr = new ArraySel(maxSize);  // create the array

        arr.insert(77);               // insert items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items

        arr.selectionSort();          // selection-sort them

        arr.display();                // display them again
    }  // end main()
}  // end class SelectSortApp

