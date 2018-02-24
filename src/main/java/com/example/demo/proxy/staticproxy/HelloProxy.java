package com.example.demo.proxy.staticproxy;

import com.example.demo.proxy.Hello;
import com.example.demo.proxy.HelloImpl;
//静态代理类
public class HelloProxy implements Hello {
	private Hello hello;
	public  HelloProxy() {
		hello = new HelloImpl();
	}
	
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}
	@Override
	public void say(String name) {
		before();
		hello.say(name);
		after();
	}
	
}
