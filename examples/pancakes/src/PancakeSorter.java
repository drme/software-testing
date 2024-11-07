
public class PancakeSorter
{

	static <T> boolean swap(T[] array, int idx, int idy)
	{
		T swap = array[idx];
		array[idx] = array[idy];
		array[idy] = swap;
		return true;
	}

	/**
	 * This method checks if first element is less then the other element
	 * 
	 * @param v first element
	 * @param w second element
	 * @return true if the first element is less then the second element
	 */
	static <T extends Comparable<T>> boolean less(T v, T w)
	{
		return v.compareTo(w) < 0;
	}

	public <T extends Comparable<T>> T[] sort(T[] array)
	{
		doSort(array, 0, array.length - 1);
		return array;
	}

	/**
	 * The sorting process
	 *
	 * @param left The first index of an array
	 * @param right The last index of an array
	 * @param array The array to be sorted
	 **/

	private static <T extends Comparable<T>> void doSort(T[] array, int left, int right)
	{
		if (left < right)
		{
			int pivot = partition(array, left, right);
			doSort(array, left, pivot - 1);
			doSort(array, pivot, right);
		}
	}

	/**
	 * This method finds the partition index for an array
	 *
	 * @param array The array to be sorted
	 * @param left The first index of an array
	 * @param right The last index of an array Finds the partition index of an array
	 **/

	private static <T extends Comparable<T>> int partition(T[] array, int left, int right)
	{
		int mid = (left + right) / 2;
		T pivot = array[mid];

		while (left <= right)
		{
			while (less(array[left], pivot))
			{
				++left;
			}
			while (less(pivot, array[right]))
			{
				--right;
			}
			if (left <= right)
			{
				swap(array, left, right);
				++left;
				--right;
			}
		}
		return left;
	}

}
