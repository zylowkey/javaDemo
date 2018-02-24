package com.example.demo.proxy;
//委托类
public class HelloImpl implements Hello {

	@Override
	public void say(String name) {
		System.out.println("hello "+name);
	}

}
