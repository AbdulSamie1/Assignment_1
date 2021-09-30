import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Stack_Test {
	public Stack stk;
	@Before
	public void setup() {
		stk = new Stack();
	}
	int [] arr = {9,8,7,6,5,4,3,2,1,0};
    int ind = 5;
	@Test
	public void test1() {
		for(int i=0;i<arr.length;i++) {
			stk.push(arr[i]);
		}
		Stack.Node lis = stk.head;
		stk.display();
		int res = 5;
		for(int i=0; i<arr.length; i++) {
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
			stk.push(arr[i]);
		}
		Stack.Node lis = stk.head;
		stk.display();
		for(int i = 0; i<arr.length-5;i++) {
			stk.pop();
		}
		stk.display();
		int res = 4;
		ind = 4;
		for(int i=0; i<arr.length-5; i++) {
			System.out.println(lis.key);
			if(i == ind) {
				Assert.assertEquals(res,lis.key);
			}
			lis = lis.next;
		}
	}
	
	@Test
	public void test3() {
		for(int i=0;i<arr.length;i++) {
			stk.push(arr[i]);
		}
		Stack.Node lis = stk.head;
		stk.display();
		int res = stk.top();
		stk.display();
		//int res = ;
		ind = 0;
		Assert.assertEquals(ind,res);
	}

}
