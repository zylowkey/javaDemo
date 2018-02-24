package com.example.demo.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLib是针对类来实现代理的，他的原理是对指定的目标生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 * @author 1933
 *
 */
public class CglibProxy implements MethodInterceptor {
	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> cls) {
		return (T) Enhancer.create(cls, this);
	}
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		before();
		Object result = methodProxy.invokeSuper(object, args);
		after();
		return result;
	}

}
