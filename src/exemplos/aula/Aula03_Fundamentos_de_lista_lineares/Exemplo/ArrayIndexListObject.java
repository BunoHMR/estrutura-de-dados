package exemplos.aula.Aula03_Fundamentos_de_lista_lineares.Exemplo;

public class ArrayIndexListObject {
    private Object[] A;  // array storing the elements of the indexed list
    private int capacity = 16;  // initial length of array A
    private int size = 0; // number of elements stored in the indexed list
//--------------------------------------------------------------------  

    /**
     * Creates the indexed list with initial capacity 16.
     */
    public ArrayIndexListObject() {
        A = new Object[capacity];
    }
//--------------------------------------------------------------------         

    /**
     * Returns the number of elements in the indexed list.
     */
    public int size() {
        return size;
    }
//--------------------------------------------------------------------  

    /**
     * Returns whether the indexed list is empty.
     */
    public boolean isEmpty() {
        return size() == 0;
    }
//--------------------------------------------------------------------  

    /**
     * Returns the element stored at the given index.
     */
    public Object get(final int r) throws IndexOutOfBoundsException {
        checkIndex(r, size());
        return A[r];
    }
//--------------------------------------------------------------------  

    /**
     * Replaces the element stored at the given index.
     */
    public Object set(final int r, final Object e) throws IndexOutOfBoundsException {
        checkIndex(r, size());
        final Object temp = A[r];
        A[r] = e;
        return temp;
    }
//--------------------------------------------------------------------  

    /**
     * Inserts an element at the given index.
     */
    public void add(final int r, final Object e) throws IndexOutOfBoundsException {
        checkIndex(r, size() + 1);
        if (size == capacity) {// an overflow
            capacity *= 2;
            final Object[] B = new Object[capacity];
            for (int i = 0; i < size; i++) B[i] = A[i];
            A = B;
        }

        for (int i = size - 1; i >= r; i--) A[i + 1] = A[i];
        A[r] = e;
        size++;
    }
//--------------------------------------------------------------------  

    /**
     * Removes the element stored at the given index.
     */
    public Object remove(final int r) throws IndexOutOfBoundsException {
        checkIndex(r, size());
        final Object temp = A[r];
        for (int i = r; i < size - 1; i++)// shift elements down
        {
            A[i] = A[i + 1];
        }

        size--;
        return temp;
    }
//--------------------------------------------------------------------  

    /**
     * Checks whether the given index is in the range [0, n - 1]
     */
    protected void checkIndex(final int r, final int n) throws IndexOutOfBoundsException {
        if (r < 0 || r >= n)
            throw new IndexOutOfBoundsException("Illegal index: " + r);
    }
}
//########################################################################

