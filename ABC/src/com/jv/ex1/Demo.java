package com.jv.ex1;

public class Demo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	public Demo(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			System.out.println(threadName);
	}
		public void start() {
			if(t== null) {
				t= new Thread(this , threadName);
			}
		}
		
	}


