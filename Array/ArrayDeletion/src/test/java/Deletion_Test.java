import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Deletion_Test{ 
	public ArrayDeletion objdeletiontest;
	@Before
	public void setup() {
		objdeletiontest = new ArrayDeletion();
	}
	
	@Test
	public void test() {
		int[] arr = {1,6,34,0,2,43};
		int index = 3;
		int[] expectedArr = {1,6,34,2,43,-1};
		int[] result = objdeletiontest.delete(arr,index);
		objdeletiontest.display(arr);
		for(int i = 0;i<result.length;i++) {
			Assert.assertEquals(expectedArr[i],result[i]);
		}
	}
	
	@Test
	public void test1() {
		int[] arr = {1,6,34,0,2,43};
		int index = 7;
		int[] expectedArr = {1,6,34,0,2,43};
		int[] result = objdeletiontest.delete(arr,index);
		objdeletiontest.display(arr);
		for(int i = 0;i<result.length;i++) {
			Assert.assertEquals(expectedArr[i],result[i]);
		}
	}
}
