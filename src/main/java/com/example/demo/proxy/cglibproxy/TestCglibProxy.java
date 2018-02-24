package com.example.demo.proxy.cglibproxy;

import com.example.demo.proxy.HelloImpl;

public class TestCglibProxy {
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		HelloImpl hello = cglibProxy.getProxy(HelloImpl.class);
		hello.say("HAHA");
	}
}
