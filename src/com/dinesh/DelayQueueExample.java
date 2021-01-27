package com.dinesh;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueExample {

	public static void main(String[] args) throws InterruptedException {

		DelayQueue<Delayed> delayQueue=new DelayQueue<Delayed>();
		
		Delayed delayedElement=new DelayedElement();
		
		delayQueue.put(delayedElement);
		
		System.out.println(delayQueue.take());
	}

}
