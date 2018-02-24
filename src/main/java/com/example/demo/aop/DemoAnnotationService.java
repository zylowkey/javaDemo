package com.example.demo.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截的类
 * @author 1933
 * @date   2017年11月22日
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的add操作")
	public void add(){}
}
