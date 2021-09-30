import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Dequeue_Test {
	public Dequeue dq;
	@Before
	public void setup() {
		dq = new Dequeue(4);
	}
	@Test
	public void test1() {
		int [] arr = {1,2,3,4};
		for(int i = 0; i< arr.length;i++) {
			dq.addLeft(arr[i]);
		}
		dq.display();
		for(int i = 0; i < arr.length;i++) {
			Assert.assertArrayEquals(arr, dq.array);
		}
	}
	@Test
	public void test2() {
		int [] arr = {1,2,3,4};
		for(int i = 0; i< arr.length;i++) {
			dq.addRight(arr[i]);
		}
		int [] arr1 = {4,3,2,1};
		dq.display();
		for(int i = 0; i < arr.length;i++) {
			Assert.assertArrayEquals(arr1, dq.array);
		}
	}
}
