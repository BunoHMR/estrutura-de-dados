package exemplos.aula.Aula06_Ordenacao.Exemplo;

// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//##############################################################
class ArrayIns {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    private int MAX;

    //--------------------------------------------------------------
    public ArrayIns(final int max)          // constructor
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
        for (int j = 0; j < nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

    //--------------------------------------------------------------
    public void insertionSort() {
        int i, j;
        long temp;

        for (i = 1; i < MAX; i++)     // out is dividing line
        {
            temp = a[i];            // remove marked item
            j = i;                      // start shifts at out
            while ((j > 0) && (a[j - 1] >= temp)) // until one is smaller,
            {
                a[j] = a[j - 1];            // shift item to right
                --j;                       // go left one position
            }
            a[j] = temp;                  // insert marked item
        }  // end for
    }  // end insertionSort()
}  // end class ArrayIns

//##############################################################
class InsertSortApp {
    public static void main(final String[] args) {
        final int maxSize = 5;            // array size
        final ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        arr.insert(50);               // insert 10 items
        arr.insert(37);
        arr.insert(48);
        arr.insert(19);
        arr.insert(26);

        arr.display();                // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();                // display them again
    }  // end main()
}  // end class InsertSortApp
