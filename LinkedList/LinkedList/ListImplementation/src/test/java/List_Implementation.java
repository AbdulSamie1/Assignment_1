import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class List_Implementation {
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
			objList.add(arr[i]);
		}
		LinkedList lis = objList.headPointer;
		objList.display();
		for(int i=0; i<arr.length; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				System.out.println(arr[i]);
				Assert.assertEquals(arr[i],lis.data);
			}
			lis = lis.nextPointer;
		}
		objList.headPointer = null;
    }
	@Test
	public void test2() {
		//int[] arr2 = {9,8,7,6,5,4,3,2,1,11};
		objList.headPointer = null;
		for(int i=0;i<array.length;i++) {
			objList.pushFront(arr[i]);
		}
		LinkedList lis = objList.headPointer;
		objList.display();
		int var = arr.length;
		int result = 5;
		//System.out.print(var);
		for(int i=0; i<var; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				System.out.println(arr[i]);
				Assert.assertEquals(result,lis.data);
			}
			lis = lis.nextPointer;
		}
		//objList.headPointer = null;
    }
	@Test
	public void test3() {
		int[] arr2 = { 11,1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,11};
		//objList.headPointer = null;
		for(int i=0;i<array.length;i++) {
			objList.pushBack(arr[i]);
		}
		LinkedList lis = objList.headPointer;
		objList.display();
		int var = arr2.length;
		int result = 11;
		ind = 19;
		System.out.print(var);
		for(int i=0; i<var; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				Assert.assertEquals(result,lis.data);
			}
			lis = lis.nextPointer;
		}
    }
	
	
	@Test
	public void test4() throws Exception {
		//objList.display();
		//int[] arr2 = {9,8,7,6,5,4,3,2,1,11};
		for(int i = 0; i< 10;i++) {
			objList.popFront();
		}
		LinkedList lis = objList.headPointer;
		objList.display();
		int var = arr.length;
		for(int i=0; i<var; i++) {
			//System.out.println(cir.key);
			if(i == ind) {
				Assert.assertEquals(arr[i],lis.data);
			}
			lis = lis.nextPointer;
		}
    }
	@Test
	public void test5() {
		//int[] arr2 = {9,8,7,6,5,4,3,2,1,11};
		LinkedList lis = objList.headPointer;
		//objList.display();
		objList.numofElements = 10;
		//objList.display();
		int var = 10;
		int res = objList.size();
		Assert.assertEquals(var,res);
		
    }
	@Test
	public void test6() throws Exception {
		//int[] arr2 = {9,8,7,6,5,4,3,2,1,11};
		LinkedList lis = objList.headPointer;
		objList.display();
		//objList.numofElements = 10;
		//objList.display();
		int var = 11;
		int res = objList.topBack();
		Assert.assertEquals(var,res);
		
    }
	@Test
	public void test7() throws Exception {
		//int[] arr2 = {9,8,7,6,5,4,3,2,1,11};
		LinkedList lis = objList.headPointer;
		objList.display();
		//objList.numofElements = 10;
		//objList.display();
		int var = 9;
		int res = objList.topFront();
		Assert.assertEquals(var,res);
		
    }
}
