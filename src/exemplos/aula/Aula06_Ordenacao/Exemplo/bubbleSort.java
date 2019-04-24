package exemplos.aula.Aula06_Ordenacao.Exemplo;

// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
//###############################################################
class ArrayBub {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    private int MAX;

    //--------------------------------------------------------------
    public ArrayBub(final int max)          // constructor
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
        int j;

        for (j = 0; j < MAX; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

    //--------------------------------------------------------------
    public void bubbleSort() {
        int i, j;

        for (i = 0; i < MAX - 1; i++) {
            for (j = i + 1; j < MAX; j++) {
                if (a[i] > a[j]) swap(i, j);
            }
        }
    }

    //--------------------------------------------------------------
    private void swap(final int one, final int two) {
        final long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}  // end class ArrayBub

//###############################################################
class BubbleSortApp {
    public static void main(final String[] args) {
        final int maxSize = 10;             // array size
        final ArrayBub arr;                 // reference to array
        arr = new ArrayBub(maxSize);  // create the array

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

        arr.bubbleSort();             // bubble sort them

        arr.display();                // display them again
    }  // end main()
}  // end class BubbleSortApp

