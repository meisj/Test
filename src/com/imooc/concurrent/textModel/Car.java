package com.imooc.concurrent.textModel;

/**
 *  这是测试 单例方法
 * @author meisj
 */
public class Car {
	private static Car instance;
	public static  synchronized Car getInstance(){
		if(instance==null){
			instance = new Car();
		}
		return instance;
	}
	//测试构造方法
	public Car(){
		System.out.println("这是测试单例模式的构造方法！");
	}
	//测试实例方法
	public static void textPrint(){
		System.out.println("这是测试单例模式的实际方法！");
	}
}
