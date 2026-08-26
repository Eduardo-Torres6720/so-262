package com.produtor_consumidor;

public class Factory
{
	public static void main(String args[]) {
		Buffer server = new BoundedBuffer();

      		// now create the producer and consumer threads
      		Thread producerThread = new Thread(new Producer(server));
      		Thread consumerThread = new Thread(new Consumer(server));

            System.out.println("Eduardo de Jesus Torres Souza");

      		producerThread.start();
      		consumerThread.start();               
	}
}