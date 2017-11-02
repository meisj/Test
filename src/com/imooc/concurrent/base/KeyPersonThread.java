package com.imooc.concurrent.base;

public class KeyPersonThread  extends Thread {
	
	public void run(){
          System.out.println(Thread.currentThread().getName()+"开始了战斗！");
          for(int i=1;i<6;i++){
              System.out.println(Thread.currentThread().getName()+"左突右杀,攻击隋军...");
          }
		  System.out.println(Thread.currentThread().getName()+"结束了战斗！");
     }

}
