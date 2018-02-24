package com.example.demo.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	private Object object;
	public DynamicProxy(Object object) {
		this.object = object;
	}
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}
	
	/**
	 * JDK动态代理类实现了InvocationHandler接口。在重写的invoke方法中可以看出，JDK动态代理的基础是反射（method.invoke(对象，参数)）
	 * Proxy.newProxyInstance()，这个方法。字面上的意思是 新建一个代理类的实例，这一点就和静态代理不同了。里面的参数有三个 类加载器、所有的接口，得到InvocationHandler接口的子类实例。
	 * 这就是JDK动态代理，该代理有以下几种特点：
	 * 1、Interface：对于JDK Proxy,业务类是需要一个Interface的，这是一个缺陷；
　　       * 2、Proxy：Proxy类是动态产生的，这个类在调用Proxy.newProxyInstance()方法之后，产生一个Proxy类的实力。实际上，这个Proxy类也是存在的，不仅仅是类的实例，这个Proxy类可以保存在硬盘上；
　　       * 3、Method：对于业务委托类的每个方法，现在Proxy类里面都不用静态显示出来
　　       * 4、InvocationHandler：这个类在业务委托类执行时，会先调用invoke方法。invoke方法在执行想要的代理操作，可以实现对业务方法的再包装。
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(object, args);
		after();
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		/**
		 * ClassLoader loader :类加载器
		 * Class<?>[] interfaces:得到全部的接口
		 * InvocationHandler:得到InvocationHandler接口的子类实现
		 */
		return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
}
