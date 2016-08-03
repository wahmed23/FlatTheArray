import java.util.ArrayList;
import java.util.List;

public class FlatThatArray {

	public static void main(String[] args) {

		Object[] unstructuredArray = new Object[] { new Object[] { 1, 2, new Integer[] { 3 } }, 4 };
		List<Integer> flatenedArrayList = null ;

		Integer[] FlatenedArray = FlatTheArray(unstructuredArray, flatenedArrayList);
		if (FlatenedArray != null){
		displayFlattenedArray(FlatenedArray);
		}
	}

	public static Integer[] FlatTheArray(Object[] unstructuredArray, List<Integer> flatenedArrayList) {
		if (flatenedArrayList == null){
			flatenedArrayList = new ArrayList<Integer>();
		}
		if (unstructuredArray == null){
			System.out.println("null Array at input");
			return null;
		}
		int size = unstructuredArray.length;
		for (int i = 0; i < size; i++) {
			if (unstructuredArray[i] instanceof Integer) {
				flatenedArrayList.add((Integer) unstructuredArray[i]);
			} else {
				FlatTheArray((Object[]) unstructuredArray[i], flatenedArrayList);
			}
		}

		Integer[] flatenedArray = new Integer[flatenedArrayList.size()];
		flatenedArray = flatenedArrayList.toArray(flatenedArray);
		return flatenedArray;
	}

	/**
	 * @param FlatenedArray
	 */
	public static void displayFlattenedArray(Integer[] FlatenedArray) {
		for (Integer FlattenedValue : FlatenedArray) {
			System.out.print(FlattenedValue + " ");
		}
	}
}
