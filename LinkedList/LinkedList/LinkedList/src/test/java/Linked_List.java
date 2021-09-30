import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Linked_List {
	public LinkedList objList;
    @Before
    public void setup() {
    	objList = new LinkedList();
	}
    
    int [] array = new int[10];
    int [] arr = {9,8,7,6,5,4,3,2,1,11};
    int ind = 5;
	@Test
	public void test1() {
		for(int i=0;i<array.length;i++) {
			objList.pushFront(arr[i]);
		}
		LinkedList.Node lis = objList.head;
		int res = 5;
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
		for(int i=0;i<array.length;i++) {
			objList.pushBack(arr[i]);
		}
		LinkedList.Node lis = objList.head;
		
		for(int i=0; i<arr.length; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				Assert.assertEquals(arr[i],lis.key);
			}
			lis = lis.next;
		}
    }
	@Test
    public void test3() {
		for(int i=0;i<array.length;i++) {
			objList.pushBack(arr[i]);
		}
		LinkedList.Node lis = objList.head;
		objList.popBack();
		for(int i=0; i<arr.length && lis.next != null; i++) {
			//System.out.println(lis.key);
			if(i == ind) {
				Assert.assertEquals(arr[i],lis.key);
			}
			lis = lis.next;
		}
    }
	@Test
    public void test4() {
		for(int i=0;i<array.length;i++) {
			objList.pushBack(arr[i]);
		}
		LinkedList.Node lis = objList.head;
		objList.popFront();
		for(int i=0; i<arr.length && lis.next != null; i++) {
			//System.out.println(lis.key);
			if(i == ind) {
				Assert.assertEquals(arr[i],lis.key);
			}
			lis = lis.next;
		}
    }
    
	@Test
    public void test5() {
		for(int i=0;i<array.length;i++) {
			objList.pushBack(arr[i]);
		}
		LinkedList.Node lis = objList.head;
		objList.pop(9);
		objList.display();
		for(int i=0; i<arr.length && lis.next != null; i++) {
			//System.out.println(lis.key);
			if(i == ind) {
				Assert.assertEquals(arr[i],lis.key);
			}
			lis = lis.next;
		}
    }
	
}
