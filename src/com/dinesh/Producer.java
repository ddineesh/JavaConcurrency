package com.dinesh;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue<Integer> queue = null;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			System.out.println("Producer put 0");
			queue.put(0);
			System.out.println("Producer put 1");
			Thread.sleep(1000);
			queue.put(1);
			System.out.println("Producer put 2");
			Thread.sleep(1000);
			queue.put(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
