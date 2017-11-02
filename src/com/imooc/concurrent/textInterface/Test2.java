package com.imooc.concurrent.textInterface;

import java.util.Arrays;

public class Test2 implements Test {

	@Override
	public void getName() throws Exception {

		Arrays.asList( "p", "k", "u","f", "o", "r","k").forEach( e -> System.out.println( e ) ); 
	}



}
