package com.example.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 事件监听器
 * @author 1933
 * @date   2017年11月22日
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息: "+msg);
	}

}
