package com.upskill.java_6;

public class MultithreadingRunable implements Runnable{


	public void run() {
		try {
			System.out.println("Thread Number # " + Thread.currentThread().getId()+ " is Runing");
		
		} catch (Exception e ) {
			System.out.println("Execption is caught");
			e.printStackTrace();




		}

	}

}




