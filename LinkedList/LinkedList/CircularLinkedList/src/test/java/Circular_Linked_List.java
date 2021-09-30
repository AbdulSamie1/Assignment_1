import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class Circular_Linked_List {
	
	 	
	    public CircularLinkedList objCircular;
	    @Before
	    public void setup() {
	    	objCircular = new CircularLinkedList();
		}
	    
	    int [] array = new int[10];
	    int [] arr = {9,8,7,6,5,4,3,2,1,11};
	    int ind = 5;
	    @Test
	    public void test1() {
			for(int i=0;i<array.length;i++) {
				objCircular.pushFront(arr[i]);
			}
			CircularLinkedList.Node cir = objCircular.head;
			int res = 5;
			for(int i=0; i<arr.length; i++) {
				//System.out.println(cir.key);
				if(i == ind) {
					Assert.assertEquals(res,cir.key);
				}
				cir = cir.next;
			}
	    }
	    @Test
	    public void test2() {
			for(int i=0;i<array.length;i++) {
				objCircular.pushBack(arr[i]);
			}
			CircularLinkedList.Node cir = objCircular.head;
			
			for(int i=0; i<arr.length; i++) {
				//System.out.println(cir.key);
				if(i == ind) {
					Assert.assertEquals(arr[i],cir.key);
				}
				cir = cir.next;
			}
	    }
	    @Test
	    public void test3() {
			for(int i=0;i<array.length;i++) {
				objCircular.pushBack(arr[i]);
			}
			CircularLinkedList.Node cir = objCircular.head;
			objCircular.popBack();
			for(int i=0; i<arr.length; i++) {
				//System.out.println(cir.key);
				if(i == ind) {
					Assert.assertEquals(arr[i],cir.key);
				}
				cir = cir.next;
			}
	    }
	    
	    @Test
	    public void test4() {
			for(int i=0;i<array.length;i++) {
				objCircular.pushBack(arr[i]);
			}
			CircularLinkedList.Node cir = objCircular.head;
			objCircular.popFront();
			for(int i=0; i<arr.length; i++) {
				//System.out.println(cir.key);
				if(i == ind) {
					Assert.assertEquals(arr[i],cir.key);
				}
				cir = cir.next;
			}
	    }
	    @Test
	    public void test5() {
			for(int i=0;i<array.length;i++) {
				objCircular.pushBack(arr[i]);
			}
			CircularLinkedList.Node cir = objCircular.head;
			for(int i = 0;i < arr.length;i++) {
				objCircular.popFront();
			}
			for(int i=0; i<arr.length; i++) {
				//System.out.println(cir.key);
				if(i == ind) {
					Assert.assertEquals(arr[i],cir.key);
				}
				cir = cir.next;
			}
	    }
}
