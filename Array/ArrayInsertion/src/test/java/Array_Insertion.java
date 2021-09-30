import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Array_Insertion {
	public ArrayInsertion objInsertiontest;
	@Before
	public void setup() {
		objInsertiontest = new ArrayInsertion();
	}
	
	@Test
	public void test() {
		int [] arr = new int[10];
		int [] result = new int [10];
		result = objInsertiontest.insert(arr,1,0);
		result = objInsertiontest.insert(arr,5,2);
		int[] expectedArr = {1,0,5,0,0,0,0,0,0,0};
		for(int i = 0 ; i<result.length;i++) {
			Assert.assertEquals(expectedArr[i],result[i]);
		}
	}
	@Test
	public void test1() {
		int [] arr = new int[10];
		int [] result = new int [10];
		result = objInsertiontest.insert(arr,1,0);
		result = objInsertiontest.insert(arr,5,2);
		result = objInsertiontest.insert(arr,6,3);
		result = objInsertiontest.insert(arr,5,2);
		result = objInsertiontest.insert(arr,9,7);
		result = objInsertiontest.insert(arr,8,9);
		int[] expectedArr = {1,0,5,5,6,0,0,9,0,8};
		for(int i = 0 ; i<result.length;i++) {
			Assert.assertEquals(expectedArr[i],result[i]);
		}
	}
}
