package com.imooc.concurrent.base;

//军队线程 模拟双方作战行为
public class ArmyRunnable implements Runnable {
	volatile boolean keepRunning = true;
	@Override
	public void run() {
		while(keepRunning){
			for(int i=1;i<6;i++){
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();//让出处理时间  下次该谁攻击还不一定了
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗！");
	}
	
}
