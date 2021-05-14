public class mergeSort {
	private static <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
		
		for (int i = lo, j = mid, k = lo; k < hi; k++) {
			if (i == mid)
				aux[k] = a[j++];
			else if (j == hi)
				aux[k] = a[i++];
			else if (a[i].compareTo(a[j]) <= 0)
				aux[k] = a[i++];
			else
				aux[k] = a[j++];
		}
		
		for (int k = lo; k < hi; k++)
			a[k] = aux[k];
	}

	private static <T extends Comparable<T>> void sort(T[] a, T[] aux, int lo, int hi) {
		if (hi - lo == 1)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void sort(T[] a) {
		T[] aux = (T[])new Comparable[a.length];
		sort(a, aux, 0, a.length);
	}
}