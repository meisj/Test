package com.imooc.concurrent.textInterface;

public interface Test {
	
	public void getName() throws Exception;
	
	public default String getMeter(){
		return "nihaodd";
	}

}
