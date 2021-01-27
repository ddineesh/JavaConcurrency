package com.dinesh;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException   {

		CountDownLatch countDownLatch=new CountDownLatch(3);
		
		Waiter waiter=new Waiter(countDownLatch);
		Decrementer decrementer=new Decrementer(countDownLatch);
		
		new Thread(waiter).start();
		new Thread(decrementer).start();
		
		Thread.sleep(4000);
		
	}

}
