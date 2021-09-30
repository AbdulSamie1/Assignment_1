import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Queue_Test {
	public Queue que;
	@Before
	public void setup() {
		que = new Queue();
	}
	//int [] array = new int[10];
    int [] arr = {9,8,7,6,5,4,3,2,1,11};
    int ind = 5;
	@Test
	public void test1() {
		for(int i=0;i<arr.length;i++) {
			que.enqueue(arr[i]);
		}
		Queue.Node lis = que.head;
		que.display();
		int res = 4;
		for(int i=0; i<arr.length-1; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				Assert.assertEquals(res,lis.key);
			}
			lis = lis.next;
		}
    }
	@Test
	public void test2() {
		for(int i=0;i<arr.length;i++) {
			que.enqueue(arr[i]);
		}
		for(int i=0;i<arr.length - 5;i++) {
			que.dequeue();
		}
		Queue.Node lis = que.head;
		que.display();
		int res = 2;
		ind = 7;
		for(int i=5; i<arr.length; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				Assert.assertEquals(res,lis.key);
			}
			lis = lis.next;
		}
    }

}
