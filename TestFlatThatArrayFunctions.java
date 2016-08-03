import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestFlatThatArrayFunctions {

    @SuppressWarnings("deprecation")
	@Test
    public void FlatTheArrayNull() {
    	Object[] unstructuredArray = null;
    	List<Integer> flatenedArrayList = null;
    	assertEquals(null, FlatThatArray.FlatTheArray(unstructuredArray, flatenedArrayList));
    	}

    @SuppressWarnings("deprecation")
	@Test
    public void FlatTheArraySimple() {
    	Object[] unstructuredArray = {1,2,3,4};
    	Integer[] unstructuredArrayAnswer = {1,2,3,4};
    	List<Integer> flatenedArrayList = null;
    	assertEquals(unstructuredArrayAnswer, FlatThatArray.FlatTheArray(unstructuredArray, flatenedArrayList));
    	}
    
    @SuppressWarnings("deprecation")
	@Test
    public void FlatTheArrayNested() {
    	Object[] unstructuredArray = {1,new Object[]{2,3, new Object[]{4,5}}};
    	Integer[] unstructuredArrayAnswer = {1,2,3,4,5};
    	List<Integer> flatenedArrayList = null;
    	assertEquals(unstructuredArrayAnswer, FlatThatArray.FlatTheArray(unstructuredArray, flatenedArrayList));
    	}

}