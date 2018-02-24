package com.example.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.demo.aop")
@EnableAspectJAutoProxy  //注解开启Spring对AspectJ代理的支持
public class AopConfig {

}
