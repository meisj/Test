package com.imooc.concurrent.textMoney;

public class AddMoneyThread implements Runnable {
	private Account account;    // 存入账户
    private double money;       // 存入金额

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }
	@Override
	public void run() {
		//第一种办法是 在存入账号中 加同步关键字
		synchronized (account) {
            account.deposit(money); 
        }
		//account.deposit(money);
	}

}
