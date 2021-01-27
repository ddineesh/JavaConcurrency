package com.dinesh;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	protected BlockingQueue<Integer> queue=null;

	public Consumer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		
		try {
			System.out.println("Consumer take: "+queue.take());
			System.out.println("Consumer take: "+queue.take());
			System.out.println("Consumer take: "+queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
