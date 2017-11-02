package com.imooc.concurrent.textMoney;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {

	public static void main(String[] args) {
        Account account = new Account();
        //线程池
        ExecutorService service = Executors.newFixedThreadPool(100);

        for(int i = 1; i <= 100; i++) {
            service.execute(new AddMoneyThread(account, 1));
        }

        service.shutdown();//关闭线程池  
        //判断是否所有的线程已经运行完  
       while(!service.isTerminated()) {}
      // System.out.println(service.isShutdown());

        System.out.println("账户余额: " + account.getBalance());
    }

}
