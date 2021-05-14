public class ArrayUtils {

	public static <T> int find(T[] a, int lo, int hi, T value) {

		assert a != null;
		assert 0 <= lo && lo <= a.length;
		assert 0 <= hi && hi <= a.length;

		for (int i = lo; i < hi; i++)
			if (a[i].equals(value))
				return i;
		return -1;
	}

	public static <T> int find(T[] a, T value) {
		return find(a, 0, a.length, value);
	}

	public static <T> int count(T[] a, int lo, int hi, T value) {
		int c = 0;
		for (int i = lo; i < hi; i++)
			if (a[i].equals(value))
				c++;
		return c;
	}
	
	public static <T> int count(T[] a, T value) {
		return count(a, 0, a.length, value);
	}

	public static <T extends Comparable<T>> int minElement(T[] a, int lo, int hi) {
		
		assert a != null;
		assert hi > lo;
		assert 0 <= lo && lo < a.length;
		assert 0 <= hi && hi <= a.length;

		int minIdx = lo;
		for (int i = lo+1; i < hi; i++)
			if (a[i].compareTo(a[minIdx]) < 0)
				minIdx = i;
		return minIdx;
	}

	public static <T extends Comparable<T>> int minElement(T[] a) {
		return minElement(a, 0, a.length);
	}

	public static <T extends Comparable<T>> int maxElement(T[] a, int lo, int hi) {
		int maxIdx = lo;
		for (int i = lo+1; i < hi; i++)
			if (a[i].compareTo(a[maxIdx]) > 0)
				maxIdx = i;
		return maxIdx;
	}

	public static <T extends Comparable<T>> int maxElement(T[] a) {
		return maxElement(a, 0, a.length);
	}

	public static <T extends Comparable<T>> int lowerBound(T[] a, int lo, int hi, T key) {

		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid].compareTo(key) < 0)
				lo = mid + 1;
			else
				hi = mid;
		}
		return lo;
	}
	
	public static <T extends Comparable<T>> int lowerBound(T[] a, T key) {
		return lowerBound(a, 0, a.length, key);
	}

	public static <T extends Comparable<T>> int upperBound(T[] a, int lo, int hi, T key) {

		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid].compareTo(key) <= 0)
				lo = mid + 1;
			else
				hi = mid;
		}
		return lo;
	}
	
	public static <T extends Comparable<T>> int upperBound(T[] a, T key) {
		return lowerBound(a, 0, a.length, key);
	}
}
