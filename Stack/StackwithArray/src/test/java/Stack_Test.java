import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Stack_Test {
	public Stack stk;
	@Before
	public void setup() {
		stk = new Stack();
	}
	int ind = 2;
	@Test
	public void test1() {
		//int [] arr = {2,3,1,4,5};
		for(int i = 0 ;i <stk.array.length;i++) {
			stk.push(i);
		}
		int res = 1;
		stk.display();
		for(int i = 0;i<stk.array.length;i++) {
			if(ind == i) {
				assertEquals(i,stk.array[i]);
			}
		}
	}
	
	@Test
	public void test2() {
		stk.display();
		int [] arr = {2,3,1,4,5};
		for(int i = 0 ;i <arr.length;i++) {
			stk.push(arr[i]);
		}
		int res = 1;
		stk.display();
		for(int i = 0;i<arr.length;i++) {
			if(ind == i) {
				assertEquals(res,stk.array[i]);
			}
		}
	}
	
	@Test
	public void test3() {
		stk.display();
		int [] arr = {2,3,1,4,5};
		for(int i = 0 ;i <arr.length;i++) {
			stk.push(arr[i]);
		}
		int res = 4;
		ind = 3;
		stk.pop();
		stk.display();
		for(int i = 0;i<arr.length-1;i++) {
			if(ind == i) {
				assertEquals(res,stk.array[i]);
			}
		}
	}
	
	
}
