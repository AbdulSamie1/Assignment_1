import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;

public class Stack_Test {
	public MyStack stk;
	@Before
	public void setup() {
		stk = new MyStack(5);
	}
	int ind = 2;
	@Test
	public void test1() throws Exception {
		int [] arr = {2,3,1,4,5};
		for(int i = 0 ;i <arr.length;i++) {
			if(stk.topPointer>=stk.arraytostoreStack.length-1){
				throw new Exception("Cannot push,Stack is full");
			}
			else {
			stk.push(arr[i]);
			}
		}
		int res = 1;
		stk.displayStack();
		for(int i = 0;i<arr.length;i++) {
			if(ind == i) {
				assertEquals(res,stk.arraytostoreStack[i]);
			}
		}
	}
	@Test
	public void test2() throws Exception {
		int [] arr = {2,3,1,4,5};
		for(int i = 0 ;i <arr.length;i++) {
			if(stk.topPointer>=stk.arraytostoreStack.length-1){
				throw new Exception("Cannot push,Stack is full");
			}
			else {
			stk.push(arr[i]);
			}
		}
		int res = 1;
		stk.displayStack();
		stk.pop();
		stk.displayStack();
		for(int i = 0;i<arr.length-1;i++) {
				assertEquals(arr[i],stk.arraytostoreStack[i]);
		}
		int res1 = stk.size();
		assertEquals(4,res1);
	}

}
