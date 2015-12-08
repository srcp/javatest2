package com.mycompany.app;
import junit.framework.TestCase;

public class QueueTest extends TestCase{
	
	public void testQueue(){
		Queue q = new Queue(1);
		assertEquals(1, q.queue.length);		
		
	}
	public void testdequeuewhenEmpty(){
		Queue q = new Queue(1);
		try{
			q.dequeue();
			fail();
		}catch(Exception e){
			
		}
	}
	public void testenqueue(){
		Queue q = new Queue(1);
		q.enqueue(2);
		assertEquals(2, q.dequeue());
	}
}
