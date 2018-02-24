package com.example.demo.proxy.dynamicproxy;

import com.example.demo.proxy.Hello;
import com.example.demo.proxy.HelloImpl;

public class TestDynamicProxy {

	public static void main(String[] args) {
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloProxy = dynamicProxy.getProxy();
		helloProxy.say("HAHA");
	}

}
