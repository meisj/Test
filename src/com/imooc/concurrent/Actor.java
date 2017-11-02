package com.imooc.concurrent;

public class Actor extends Thread {

	public void run(){
		System.out.println(getName()+"是一个演员！");
		int count=0;
		boolean keepRunning=true;
		while(keepRunning){
			System.out.println(getName()+"登台演出："+(++count));
			if(count==100){
				keepRunning=false;
			}
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName()+"的演出结束！");
	}
	public static void main(String[] args){
		//线程 1
		Thread actor = new Actor();
		actor.setName("Mr.Thread");
		actor.start();
		
		//线程 2
	   Thread actressThread=new Thread(new Actress(),"mrs.Runnable");
		actressThread.start();
		
	}
	
}
