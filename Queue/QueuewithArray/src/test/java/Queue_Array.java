import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Queue_Array {
	public Queue que;
	@Before
	public void setup() {
		que = new Queue(5);
	}
	@Test
	public void test1() throws Exception{
		int [] arr = {1,2,3,4,5};
		for(int i = 0; i< arr.length;i++) {
			que.enqueue(arr[i]);
		}
		que.display();
		for(int i = 0; i < arr.length;i++) {
			Assert.assertEquals(arr[i], que.array[i]);
		}
		que.enqueue(6);
	}
	@Test
	public void test2() throws Exception{
		int [] arr = {1,2,3,4,5};
		for(int i = 0; i< arr.length;i++) {
			que.enqueue(arr[i]);
		}
		que.display();
		for(int i = 0; i<1;i++) {
			que.dequeue();
		}
		for(int i = 1; i < arr.length;i++) {
			Assert.assertEquals(arr[i], que.array[i]);
		}
		for(int i = 0; i<5;i++) {
			que.dequeue();
		}
	}

}
