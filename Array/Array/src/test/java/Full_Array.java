import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Full_Array {

	public Array objArray;
	@Before
	public void setup() {
		objArray = new Array();
	}
	@Test
	public void test() {
		int[] arr = new int[100];
		int sz = 0;
		objArray.array = arr;
		objArray.size = sz;
		objArray.insert(56,0);
		objArray.insert(40,1);
		objArray.insert(1,2);
		objArray.insert(2,3);
		objArray.insert(10,4);
		objArray.display();
		objArray.delete(3);
		boolean expectedR = true;
		boolean result = objArray.linearSearch(40);
		Assert.assertEquals(expectedR,result);
		objArray.bubbleSort();
		expectedR = true;
		result = objArray.binarySearch(56,0,objArray.size);
		Assert.assertEquals(expectedR,result);
	}

	@Test
	public void test1() {
		int[] arr = new int[100];
		int sz = 0;
		objArray.array = arr;
		objArray.size = sz;
		objArray.insert(56,0);
		objArray.insert(40,1);
		objArray.insert(1,2);
		objArray.insert(2,3);
		objArray.insert(10,4);
		objArray.display();
		objArray.delete(3);
		boolean expectedR = false;
		boolean result = objArray.linearSearch(20);
		Assert.assertEquals(expectedR,result);
		objArray.bubbleSort();
		expectedR = false;
		result = objArray.binarySearch(33,0,objArray.size);
		Assert.assertEquals(expectedR,result);
	}


}
