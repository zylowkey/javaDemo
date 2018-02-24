package com.example.demo.proxy.staticproxy;

import com.example.demo.proxy.Hello;

public class TestStaticProxy {

	public static void main(String[] args) {
		Hello hello = new HelloProxy();
		hello.say("Tom");
	}

}
