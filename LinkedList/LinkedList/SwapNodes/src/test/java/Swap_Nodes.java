import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Swap_Nodes {
	
	public LinkedList objList;
    @Before
    public void setup() {
    	objList = new LinkedList();
	}
    
    int [] array = new int[10];
    int [] arr = {9,8,7,6,5,4,3,2,1,11};
    int [] arr1 = {11,8,7,6,5,4,3,2,1,9};
    int ind = 5;

    @Test
	public void test1() {
		for(int i=0;i<array.length;i++) {
			objList.pushFront(arr[i]);
		}
		objList.display();
		LinkedList.Node lis = objList.head;
		int res = 5;
		for(int i=0; i<arr.length; i++) {
			//System.out.println(lis.key);
			if(i == ind) {
			//	System.out.println(lis.key);
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
		//objList.display();
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
		System.out.println("Before swapping: ");
		objList.display();
		objList.swap();
		System.out.println("Before swapping:");
		objList.display();
		for(int i=0; i<arr.length; i++) {
			//System.out.println(cir.key);
			
			Assert.assertEquals(arr1[i],lis.key);
			
			lis = lis.next;
		}
    }

}
