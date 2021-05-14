public class mergeSort {
    public static <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = hi;
        int j = lo;
        if (i == mid) {
            aux[k++] = a[i++];
        } else if (j == hi) {
            aux[k++] = a[i++];
        } else if (a[i].compareTo(a[j]) <= 0) {
            aux[k++] = a[i++];
        } else {
            aux[k++] = a[j++];
        }

        for (i = lo; i < hi; i++) {
            a[i] = aux[i];
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] a )
}